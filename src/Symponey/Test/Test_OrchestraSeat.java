package Symponey.Test;

import Symponey.Domain.OrchestraSeat;
import junit.framework.TestCase;

public class Test_OrchestraSeat extends TestCase {

	private OrchestraSeat orcseat;
	
	public Test_OrchestraSeat(String name) {
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
		orcseat = new OrchestraSeat(400.0,"A777","Test");
		assertNotNull("\t\tTest_Seat.testConstructors: model is null",orcseat);
	}

}
