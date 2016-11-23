package Symponey.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.Credit;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Credit extends TestCase{
	private Credit credit;
	private Ticket ticket;
	private Seat seat;
	private Date date;
	private Name name;
	
	public Test_Credit(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Credit.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Credit Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Credit End");	}
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Payment.testConstructors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		credit = new Credit("online", name, 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", credit);
	}
	

}
