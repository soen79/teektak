package controllers

import models.Result
import play.api.mvc.Controller
import play.api.libs.json.Json
import play.api.mvc.Action
import scala.collection.mutable.ListBuffer
import java.io.File

/**
 * This is the Handler of the web service.
 * *Configured in the conf/routes 
 * 
 */
object Search extends Controller {

	 def perform(term:String) = Action {
		 println("Search Controller - endpoint Handler invoked for param: " + term) 
		
		 val m = Result.find(term)
		 
		 println("Search Controller - returning result to User")		 
		 //Ok(Json.toJson(m)) // must be the last statement
		 Ok(Json.toJson("SEARCH COMPLETE")) // must be the last statement
  }
}