package Symponey.Test;

import java.util.Date;

import Symponey.Domain.BoughtTicket;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_BoughtTicket extends TestCase{
	private BoughtTicket boughtTicket;
	private Seat seat;
	private String id;
	private Date date;
	
	
	public Test_BoughtTicket(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_BoughtTicket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}

	public void testConstructor(){
		System.out.println("\tExecuting Test_BoughtTicket.testConstructors");
		id = "";
		seat = new Seat(15, "D15");
		date = new Date();
		boughtTicket = new BoughtTicket(id, seat, date);
		assertNotNull("\t\tTest_BoughtTicket.testConstructors: model is null", boughtTicket);
	}
}
