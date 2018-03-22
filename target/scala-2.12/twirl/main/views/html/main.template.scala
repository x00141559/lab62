
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

                <li>
                    <li """),_display_(/*31.26*/if(title=="Orders")/*31.45*/{_display_(Seq[Any](format.raw/*31.46*/("""class="active"""")))}),format.raw/*31.61*/(""">
                        <a href="/viewOrders">View Orders</a>    
                    </li>
                    
                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*38.22*/if(title=="Login")/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""class="active"""")))}),format.raw/*38.56*/(""">
                    """),_display_(/*39.22*/if(user != null)/*39.38*/ {_display_(Seq[Any](format.raw/*39.40*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/controllers/*40.46*/.security.routes.LoginCtrl.logout()),format.raw/*40.81*/("""">Logout """),_display_(/*40.91*/user/*40.95*/.getName()),format.raw/*40.105*/("""</a>
                    """)))}/*41.23*/else/*41.28*/{_display_(Seq[Any](format.raw/*41.29*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/controllers/*42.46*/.security.routes.LoginCtrl.login()),format.raw/*42.80*/("""">Login</a>
                    """)))}),format.raw/*43.22*/("""

                """),format.raw/*45.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*55.18*/content),format.raw/*55.25*/("""
            """),format.raw/*56.13*/("""</div>
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
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/main.js")),format.raw/*70.65*/(""""></script>
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
                  DATE: Thu Mar 22 12:34:42 GMT 2018
                  SOURCE: /home/wdd/webapps/lab62/app/views/main.scala.html
                  HASH: 0b97d2138f076e37eb8b4b17938dfa7df2000f4a
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1815->595|1830->601|1879->629|2006->729|2037->751|2076->752|2122->767|2262->880|2290->899|2329->900|2375->915|2625->1138|2652->1156|2691->1157|2737->1172|2787->1195|2812->1211|2852->1213|2905->1238|2942->1248|2962->1259|3018->1294|3055->1304|3068->1308|3100->1318|3145->1345|3158->1350|3197->1351|3250->1376|3287->1386|3307->1397|3362->1431|3426->1464|3472->1482|3635->1618|3663->1625|3704->1638|4012->1919|4027->1925|4088->1965
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|53->21|53->21|53->21|58->26|58->26|58->26|58->26|63->31|63->31|63->31|63->31|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|77->45|87->55|87->55|88->56|102->70|102->70|102->70
                  -- GENERATED --
              */
          