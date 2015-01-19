package models

import domain.Client

case class ClientResult() {

  object ClientResult{
    
    
    /** 
	   * Returns the list of clients in the system
	   */
	  def getClientList(term: String) : Array[Client] = {
	    
	     // Mock DB clients
	     val c1 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c2 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c3 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c4 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c5 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c6 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c7 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c8 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     val c9 = new Client(1, "Arts are us", "5235 chemin de la Côte-des-Neiges, Montréal, QC", "514 376-0981")
	     
	     val list = Array(c1, c2, c3,c4,c5,c6,c7,c8,c9)
	     list
	  }
  }
}