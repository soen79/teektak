package models

import java.io.File
import domain.Client
/**
 * Seems to be equivalent to a 'service/manager' in java.
 */
case class Result(text: String) 

	// Simple list of files in the current directory
	object Result{
	  
	  /**
	   * Access the 'database' and return a all clients in TeekTak
	   */
	  def find(term: String) : Array[Client] = {
	    
	     // Mock DB clients
	     val c1 = new Client(1, "Poulet St-Hubert ", "Sherbrooke", "514 376-0981")
	     val c2 = new Client(2, "Morgan Stanely", "West Island", "514 3726-1982")
	     val c3 = new Client(3, "Videotron", "PIE-IX", "514 976-2231")
	     val c4 = new Client(4, "Bell Canada", "Outremont", "514 976-6985")
	     val c5 = new Client(5, "Xerox", "Mont-Royale", "514 876-7911")
	     val c6 = new Client(6, "Compuware", "Dollard-Des-Ormeaux", "514 375-03454")
	     val c7 = new Client(7, "The Bay", "Laval", "514 476-1123")
	     val c8 = new Client(8, "McGill University", "St-Lambert", "450 376-4232")
	     val c9 = new Client(9, "Hydro Quebec", "Ils-des-soeurs", "450 786-0931")
	     
	     implicit val list = Array(c1, c2, c3,c4,c5,c6,c7,c8,c9)
	     list
	  }
	}
