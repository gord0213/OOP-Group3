package Symponey.Test;

import Symponey.Domain.BoothSeat;
import junit.framework.TestCase;

public class Test_BoothSeat extends TestCase {

	private BoothSeat boothseat;
	
	public Test_BoothSeat(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
 	 * Test the constructors.
 	 */
	
	public void testConstructors() {
		System.out.println("\tExecuting Test_Seat.testConstructors");
		boothseat = new BoothSeat(400.0,"A777","Test");
		assertNotNull("\t\tTest_Seat.testConstructors: model is null",boothseat);
	}
}
