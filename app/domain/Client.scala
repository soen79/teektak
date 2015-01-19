package domain

/**
 * TeekTak Client
 * 
 */
case class Client (val id: Int, val name: String, val street: String, val phone1: String) {

  val clientIdd:Int = id
  val clientName: String = name
  val clientStreet: String = street
  val clientPhone1: String = phone1
  
}