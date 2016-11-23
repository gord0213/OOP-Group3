package Symponey.Test;

import java.util.Date;

import Symponey.Domain.BoughtTicket;
import Symponey.Domain.RefundTicket;
import Symponey.Domain.Seat;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_RefundTicket extends TestCase{
	private RefundTicket refundTicket;
	private Seat seat;
	private Date date;
	
	
	public Test_RefundTicket(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_RefundTicket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}

	public void testConstructor(){
		System.out.println("\tExecuting Test_BoughtTicket.testConstructors");
		seat = new Seat(15, "D15");
		date = new Date();
		refundTicket = new RefundTicket(seat, date);
		assertNotNull("\t\tTest_BoughtTicket.testConstructors: model is null", refundTicket);
	}
}