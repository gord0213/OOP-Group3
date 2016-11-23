package Symponey.Test;

import java.util.Date;

import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite; 
/**
 *	JUnit tests for the ShannonsTheorem class from the "network" project.
 * @author Michael Gordanier
 * @version 1.0.0
 */
public class Test_Ticket extends TestCase {

	
	private Ticket ticket;
	private Seat seat;
	private String id;
	private Date date;
	
	public Test_Ticket(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Ticket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		id = "";
		seat = new Seat(15, "D15");
		date = new Date();
		ticket = new Ticket(id, seat, date);
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
