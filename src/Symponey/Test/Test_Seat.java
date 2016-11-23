/**
 * 
 */
package Symponey.Test;

import Symponey.Domain.Seat;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Maulin
 *
 */
public class Test_Seat extends TestCase {

	/**
	 * @param name
	 */
	private Seat seat;
	
	public Test_Seat(String name) {
		super(name);
	}

	public static Test suite() { return new TestSuite(Test_Soloist.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}
	
	/**
 	 * Test the constructors.
 	 */
	
	public void testConstructors() {
		System.out.println("\tExecuting Test_Seat.testConstructors");
		seat = new Seat(400.0,"A777");
		assertNotNull("\t\tTest_Seat.testConstructors: model is null",seat);
	}
	
	/**
 	 * Test the Accessors.
 	 */
	
	public void testAccessors() {
      	System.out.println("\tExecuting Test_Seat.testAccessors");
      	seat = new Seat(400.0,"A777");
		double price = seat.getPrice();
		String seatNumber = seat.getseatNumber();
		assertNotNull("\t\t Seat is null", seat);
		assertTrue("\t\tTest_Ticket.testAccessors.getPrice Failed", seat.getPrice() == price);
		assertTrue("\t\tTest_Ticket.testAccessors.getSeatNumber Failed", seat.getseatNumber() == seatNumber);
	}

	/**
	 * Testing the mutators/modifiers
	 */

	public void testMutators() {
       System.out.println("\tExecuting Test_Seat.testMutators");
     	seat = new Seat(400.0,"A777");
		double price = seat.getPrice();
		String seatNumber = seat.getseatNumber();
		assertNotNull("\t\t Seat is null", seat);
		assertFalse("\t\tTest_Ticket.testAccessors.getPrice Failed", seat.getPrice() == price);
		assertFalse("\t\tTest_Ticket.testAccessors.getSeatNumber Failed", seat.getseatNumber() == seatNumber);
	}

	/**
	 * Testing behaviors...
	 */

	public void testBehaviors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
      seat = new Seat(400.0,"A777");
      assertNotNull("\t\t Seat is null", seat);
	  boolean isTaken = seat.isTaken();
	  assertTrue("Seat is already Taken", isTaken);
	}
	
}
