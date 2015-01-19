package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.libs.json.Json
import models.Result
import domain.Client

/**
 * Controller class that returns all teektak clients 
 */
object Clients extends Controller {

  
  /**
   * Returns all the Clients in the system
   */
  def perform = Action{
     println("Clients Controller - endpoint Handler invoked") 
	 
     //What was implicit for?
     implicit val clientFormat = Json.format[Client]  // case' classes can be formated to JSON
     
     val clientList =  Result.find("ALL")
     
     val retList =  Json.obj("clients" -> clientList)
     
     Ok(retList) // must be the last statement
  }
  
  
  /**
   * Returns the details of a specific client
   */
  def getClient(term:String) = Action{
    
    implicit val clientFormat = Json.format[Client]  // case' classes can be formated to JSON
    
    val clientList =  Result.find("ALL")
      
    
    Ok("SUCCESS")
  } 
}