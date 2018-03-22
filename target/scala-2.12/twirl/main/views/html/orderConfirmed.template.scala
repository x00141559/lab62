
package views.html

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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*33.18*/if(order != null)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                    """),format.raw/*34.21*/("""<!-- Start of For loop - For each p in products add a row -->
                  
        
                    """),_display_(/*37.22*/for(i <- order.getItems) yield /*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getName),format.raw/*39.50*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getDescription),format.raw/*40.57*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getItemTotal))),format.raw/*43.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*51.68*/("%.2f".format(order.getOrderTotal))),format.raw/*51.104*/("""</strong></p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*55.31*/routes/*55.37*/.ShoppingCtrl.cancelOrder(order.getId)),format.raw/*55.75*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Cancel Order</a>
                </p>
            </div> 
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 11:21:48 GMT 2018
                  SOURCE: /home/wdd/webapps/lab62/app/views/orderConfirmed.scala.html
                  HASH: efb86f43990c9da71d618c3c68b5bc2f6fcb1a28
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1260->68|1289->153|1316->154|1387->200|1431->236|1470->238|1500->241|1573->288|1614->320|1654->322|1687->328|1758->372|1772->377|1808->392|1841->398|1881->408|1913->413|2219->692|2245->709|2285->711|2334->732|2472->843|2512->867|2552->869|2601->890|2662->924|2672->925|2712->944|2774->979|2784->980|2831->1006|2900->1048|2948->1075|3010->1110|3020->1111|3055->1125|3124->1167|3176->1198|3260->1251|3331->1291|3362->1295|3538->1444|3596->1480|3762->1619|3777->1625|3836->1663
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|65->33|65->33|65->33|66->34|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|74->42|74->42|74->42|75->43|75->43|77->45|78->46|79->47|83->51|83->51|87->55|87->55|87->55
                  -- GENERATED --
              */
          