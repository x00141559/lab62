
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab62/conf/routes
// @DATE:Thu Mar 22 12:49:10 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
