
package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import io.ebean.*;
import java.util.*;
import java.time.*;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

// Import models
import models.users.*;
import models.products.*;
import models.shopping.*;
import java.util.Calendar;

// Import security controllers
import controllers.security.*;

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller {


    /** Dependency Injection **/

    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection **/
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 **/
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 **/
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    
    // Get a user - if logged in email will be set in the session
	private Customer getCurrentUser() {
		return (Customer)User.getLoggedIn(session().get("email"));
	}

    @Transactional
    public Result showBasket() {
        return ok(basket.render(getCurrentUser()));
    }
    
    // Add item to customer basket
    @Transactional
    public Result addToBasket(Long id) {
        
        // Find the product
        Product p = Product.find.byId(id);
        
        // Get basket for logged in customer
        Customer customer = (Customer)User.getLoggedIn(session().get("email"));
        if(p.decrementStock()){
        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        p.update();
        // Add product to the basket and save
        customer.getBasket().addProduct(p);
        customer.update();
    }
        // Show the basket contents     
        return ok(basket.render(customer));
    }
    
    // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long pid) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Find the product
        Product p = Product.find.byId(pid);
        
        if(p.decrementStock()){
                    // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        p.update();
        } else{
            flash("success", "Sorry, no more of these products left");
        }


        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        Customer c = getCurrentUser();
        // Call basket remove item method
        c.getBasket().removeItem(item);
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c));
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket() {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result placeOrder() {
        Customer c = getCurrentUser();
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setCustomer(c);
        
        // Copy basket to order
        order.setItems(c.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(c, order));
    }
   
    
    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }


    public Result cancelOrder(long id){
        ShopOrder order = ShopOrder.find.byId(id);
    
        // Create Calendar instance
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        // Set the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH.
       ;
        /*
         * Use getTimeInMillis() method to get the Calendar's time value in
         * milliseconds. 
         */
        long miliSecondForDate1 = calendar1.getTimeInMillis();
        long miliSecondForDate2 = calendar2.getTimeInMillis();
        // Calculate the difference in millisecond between two dates
        long diffInMilis = miliSecondForDate2 - miliSecondForDate1;
        /*
         * Now we have difference between two date in form of millseconds we can
         * easily convert it Minute / Hour / Days by dividing the difference
         * with appropriate value. 1 Second : 1000 milisecond 1 Hour : 60 * 1000
         * millisecond 1 Day : 24 * 60 * 1000 milisecond
         */
        long diffInSecond = diffInMilis / 1000;
        long diffInMinute = diffInMilis / (60 * 1000);
    if(diffInSecond <=60){
        flash ("Your order has been cancelled");
    } else 
    flash ("Sorry, it is too late to cancel this order");
return redirect(routes.ShoppingCtrl.showBasket());

}
// @Transactional
// public Result viewOrders() {

//     Customer currUser = getCurrentUser();

//     List<ShopOrder> orders = Ebean.find(ShopOrder.class)
//     .where().eq("customer", currUser)
//     .findList();

//     return ok(viewOrders.render(currUser, orders));
//}
}