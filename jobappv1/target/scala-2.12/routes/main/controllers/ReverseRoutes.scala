// @GENERATOR:play-routes-compiler
<<<<<<< Updated upstream
// @SOURCE:C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 13:50:33 EDT 2018
=======
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 14:27:52 EDT 2018
>>>>>>> Stashed changes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Profiles")
    }
  
    // @LINE:11
    def getProfile(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:6
    def login(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}