package Symponey.Test;

import Symponey.Domain.PitSeat;
import junit.framework.TestCase;

public class Test_PitSeat extends TestCase {

	private PitSeat pitseat;
	
	public Test_PitSeat(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_Ticket Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Ticket End");
	}
	
	/**
 	 * Test the constructors.
 	 */
	
	public void testConstructors() {
		System.out.println("\tExecuting Test_Seat.testConstructors");
		pitseat = new PitSeat(400.0,"A777","Test");
		assertNotNull("\t\tTest_Seat.testConstructors: model is null",pitseat);
	}

}
