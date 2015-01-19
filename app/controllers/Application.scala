package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  // An action  is a function that handles an HTTP request and returns the
  // HTTP result
  def index = Action {
    println("WELCOME PAGE OF APPLICATION")
    Ok(views.html.index("Your new application is Complete"))
  }

}