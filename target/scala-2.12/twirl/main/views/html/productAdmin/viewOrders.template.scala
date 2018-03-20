
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._
/*7.2*/import models.customers._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


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
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getOrder() != null)/*35.49*/ {_display_(Seq[Any](format.raw/*35.51*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*37.22*/for(i <- customer.getOrder().getOrderItems()) yield /*37.67*/ {_display_(Seq[Any](format.raw/*37.69*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getName),format.raw/*39.50*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getDescription()),format.raw/*40.59*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*44.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*45.39*/routes/*45.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*45.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*53.68*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*53.118*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.ShoppingCtrl.cancelOrder(order.getId)),format.raw/*59.75*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Cancel Order</a>
                </p>
            </div>  
           
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*70.24*/("""{"""),format.raw/*70.25*/("""
		"""),format.raw/*71.3*/("""return confirm('Are you sure?');
	"""),format.raw/*72.2*/("""}"""),format.raw/*72.3*/("""
"""),format.raw/*73.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 15:25:18 GMT 2018
                  SOURCE: /media/sf_student/lab6/app/views/productAdmin/viewOrders.scala.html
                  HASH: 0411105df2504c304d47cfaff295abe8c905b93b
                  MATRIX: 981->1|1087->38|1123->68|1155->94|1187->120|1242->34|1271->146|1342->192|1383->225|1422->227|1452->230|1525->277|1566->309|1606->311|1639->317|1710->361|1724->366|1760->381|1793->387|1833->397|1865->402|2219->729|2259->760|2299->762|2348->783|2458->866|2519->911|2559->913|2608->934|2669->968|2679->969|2719->988|2781->1023|2791->1024|2840->1052|2909->1094|2957->1121|3026->1163|3078->1194|3140->1229|3150->1230|3185->1244|3256->1288|3271->1294|3324->1326|3453->1428|3468->1434|3539->1484|3680->1594|3751->1634|3782->1638|3958->1787|4030->1837|4237->2017|4252->2023|4311->2061|4682->2404|4711->2405|4741->2408|4802->2442|4830->2443|4858->2444
                  LINES: 28->1|31->4|32->5|33->6|34->7|37->1|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|80->48|81->49|85->53|85->53|91->59|91->59|91->59|102->70|102->70|103->71|104->72|104->72|105->73
                  -- GENERATED --
              */
          