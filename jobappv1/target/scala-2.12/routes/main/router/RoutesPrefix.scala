// @GENERATOR:play-routes-compiler
<<<<<<< Updated upstream
// @SOURCE:C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 13:50:33 EDT 2018
=======
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 14:27:52 EDT 2018
>>>>>>> Stashed changes


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
