// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/felix/Desktop/play-samples-play-java-starter-example/conf/routes
// @DATE:Wed Oct 21 21:58:31 EDT 2020


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
