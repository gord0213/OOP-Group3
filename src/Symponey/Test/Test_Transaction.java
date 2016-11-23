package Symponey.Test;

import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.Transaction;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Transaction extends TestCase{
	
	
	private Transaction transaction;
	private Ticket ticket;
	
	public Test_Transaction(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Transaction.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Transaction Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Transaction End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Transaction.testConstructors");
		ticket = new Ticket()
		transaction = new Transaction("online", "Miraz", 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", ticket);
	}
	
	public void testAccessors(){
		System.out.println("\t Executing Test_Ticket.testAccessors");
		id = "Identification";
		seat = new Seat(15, "D15");
		date = new Date();
		ticket = new Ticket(id, seat, date);
		assertNotNull("\t\tTest_Ticket.testAccessor: Ticket is null", ticket);
		assertTrue("\t\tTest_Ticket.testAccessors.getID Failed", ticket.getID() == id);
		assertTrue("\t\tTest_Ticket.testAccessors.getID Failed", ticket.getSeat() == seat);
		assertTrue("\t\tTest_Ticket.testAccessors.getID Failed", ticket.getDate() == date);
	}
}
