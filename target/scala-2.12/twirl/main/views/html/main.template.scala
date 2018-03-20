
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*21.48*/routes/*21.54*/.ProductCtrl.listProducts(0)),format.raw/*21.82*/("""">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="Orders")/*30.41*/{_display_(Seq[Any](format.raw/*30.42*/("""class="active"""")))}),format.raw/*30.57*/(""">
                    <a href="/viewOrders">View Orders</a>    
                </li>
                <li>
                    <a href="#">View Orders</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*39.22*/if(title=="Login")/*39.40*/{_display_(Seq[Any](format.raw/*39.41*/("""class="active"""")))}),format.raw/*39.56*/(""">
                    """),_display_(/*40.22*/if(user != null)/*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
                        """),format.raw/*41.25*/("""<a href=""""),_display_(/*41.35*/controllers/*41.46*/.security.routes.LoginCtrl.logout()),format.raw/*41.81*/("""">Logout """),_display_(/*41.91*/user/*41.95*/.getName()),format.raw/*41.105*/("""</a>
                    """)))}/*42.23*/else/*42.28*/{_display_(Seq[Any](format.raw/*42.29*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/controllers/*43.46*/.security.routes.LoginCtrl.login()),format.raw/*43.80*/("""">Login</a>
                    """)))}),format.raw/*44.22*/("""

                """),format.raw/*46.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*56.18*/content),format.raw/*56.25*/("""
            """),format.raw/*57.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("javascripts/main.js")),format.raw/*71.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 15:10:04 GMT 2018
                  SOURCE: /media/sf_student/lab6/app/views/main.scala.html
                  HASH: 70f88a7d3bed15d91757eed5beef37103ac589bb
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1815->595|1830->601|1879->629|2006->729|2037->751|2076->752|2122->767|2237->855|2265->874|2304->875|2350->890|2662->1175|2689->1193|2728->1194|2774->1209|2824->1232|2849->1248|2889->1250|2942->1275|2979->1285|2999->1296|3055->1331|3092->1341|3105->1345|3137->1355|3182->1382|3195->1387|3234->1388|3287->1413|3324->1423|3344->1434|3399->1468|3463->1501|3509->1519|3672->1655|3700->1662|3741->1675|4049->1956|4064->1962|4125->2002
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|62->30|62->30|62->30|62->30|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|78->46|88->56|88->56|89->57|103->71|103->71|103->71
                  -- GENERATED --
              */
          