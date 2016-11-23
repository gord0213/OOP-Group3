package Symponey.Test;

import Symponey.Domain.BalconySeat;
import junit.framework.TestCase;

public class Test_BalconySeat extends TestCase {

	private BalconySeat blaconySeat;
	
	public Test_BalconySeat(String name) {
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
		blaconySeat = new BalconySeat(400.0,"A777","Test");
		assertNotNull("\t\tTest_Seat.testConstructors: model is null",blaconySeat);
	}
}
