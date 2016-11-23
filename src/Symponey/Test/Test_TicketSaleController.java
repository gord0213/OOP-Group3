package Symponey.Test;

import java.util.ArrayList;
import java.util.Date;

import Symponey.Domain.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TicketSaleController extends TestCase {
	
	
	public Test_TicketSaleController(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_TicketSaleController.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsModel Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsModel End");	}
	
	 /* ATTRIBUTES	-----------------------------------------------	*/
		private ArrayList<Account> acc = new ArrayList<Account>();
		private ArrayList<Transaction> trans = new ArrayList<Transaction>();
		private ArrayList<ConcertSeason> con = new ArrayList<ConcertSeason>();
		private TicketSaleController controller ;

		public void testConstructors() {
		      System.out.println("\tExecuting Test_TicketSaleController.testConstructors");
		      con.add(new ConcertSeason(new Date()));
		      controller = new TicketSaleController(con.get(0));
				assertNotNull("\t\tTest_TicketSaleController: controller is null", controller); 
			}
	
		
		public static void main(String[] args) {
		      System.out.println("Executing Test_TicketSaleController suite");
		      junit.textui.TestRunner.run(suite());
		  }

}
