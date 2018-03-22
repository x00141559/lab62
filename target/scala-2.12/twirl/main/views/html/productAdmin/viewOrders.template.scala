
package views.html.productAdmin

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, orders: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._
/*7.2*/import controllers.ShoppingCtrl


Seq[Any](format.raw/*1.76*/("""


"""),format.raw/*8.1*/("""

"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Order", customer)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""


"""),format.raw/*14.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
        """)))}),format.raw/*21.10*/(""" 
        """),_display_(/*22.10*/for(order <- orders) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
            """),format.raw/*23.13*/("""<p> Order Number: order.getId</p>
            <p> Order Date: order.getOrderDateFormatted</p>
        

		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
               <th> Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*40.18*/if(order != null)/*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*42.22*/for(i <- order.getItems) yield /*42.46*/ {_display_(Seq[Any](format.raw/*42.48*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getProduct.getName),format.raw/*44.50*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getDescription()),format.raw/*45.59*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                       
                    </tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*52.16*/("""
			"""),format.raw/*53.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*57.68*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*57.118*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingCtrl.cancelOrder(order.getId)),format.raw/*63.75*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Cancel Order</a>
                </p>
            </div>  
           
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*74.24*/("""{"""),format.raw/*74.25*/("""
		"""),format.raw/*75.3*/("""return confirm('Are you sure?');
	"""),format.raw/*76.2*/("""}"""),format.raw/*76.3*/("""
"""),format.raw/*77.1*/("""</script>
""")))}),format.raw/*78.2*/("""
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 12:37:04 GMT 2018
                  SOURCE: /home/wdd/webapps/lab62/app/views/productAdmin/viewOrders.scala.html
                  HASH: 3d10b8e7270252fdd6367da1e3ed378f609ff04c
                  MATRIX: 1013->1|1160->79|1196->109|1228->135|1260->161|1321->75|1350->193|1379->195|1451->241|1483->264|1523->266|1553->269|1626->316|1667->348|1707->350|1740->356|1811->400|1825->405|1861->420|1894->426|1941->442|1979->453|2015->473|2055->475|2096->488|2527->892|2553->909|2593->911|2642->932|2752->1015|2792->1039|2832->1041|2881->1062|2942->1096|2952->1097|2992->1116|3054->1151|3064->1152|3113->1180|3182->1222|3230->1249|3299->1291|3351->1322|3413->1357|3423->1358|3458->1372|3566->1449|3637->1489|3668->1493|3844->1642|3916->1692|4123->1872|4138->1878|4197->1916|4568->2259|4597->2260|4627->2263|4688->2297|4716->2298|4744->2299|4785->2310
                  LINES: 28->1|31->4|32->5|33->6|34->7|37->1|40->8|42->10|43->11|43->11|43->11|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|83->51|84->52|85->53|89->57|89->57|95->63|95->63|95->63|106->74|106->74|107->75|108->76|108->76|109->77|110->78
                  -- GENERATED --
              */
          