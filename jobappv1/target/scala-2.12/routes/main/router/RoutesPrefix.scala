// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobappv1/conf/routes
// @DATE:Sun Oct 28 15:36:40 EDT 2018


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
