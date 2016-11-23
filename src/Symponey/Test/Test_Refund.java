package Symponey.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.Transaction;
import Symponey.Domain.Refund;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class Test_Refund extends TestCase {
	
	private Refund refund;
	private Ticket ticket;
	private Seat seat;
	private Date date;
	private Name name;
	
	public Test_Refund(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Refund.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Refund Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Refund End");	}
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Refund.testConstructors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		refund = new Refund("online", name, 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", refund);
	}
	

}
