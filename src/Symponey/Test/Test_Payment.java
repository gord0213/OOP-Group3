package Symponey.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.Payment;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Payment extends TestCase{
	private Payment payment;
	private Ticket ticket;
	private Seat seat;
	private Date date;
	private Name name;
	
	public Test_Payment(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Payment.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Payment Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Payment End");	}
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Payment.testConstructors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		payment = new Payment("online", name, 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", payment);
	}
	

}
