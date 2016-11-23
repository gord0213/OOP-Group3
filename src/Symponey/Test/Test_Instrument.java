package Symponey.Test;

import Symponey.Domain.Instrument;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Instrument extends TestCase {
	private Instrument instrument;
	private String name;
	private boolean owned;
	
	public Test_Instrument(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Ticket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Instrument Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Instrument End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		name = "Guitar";
		owned = true;
		instrument = new Instrument(name, owned);
		assertNotNull("\t\tTest_Instrument.testConstructors: model is null", instrument);
	}
	
	public void testAccessors(){
		System.out.println("\t Executing Test_Ticket.testAccessors");
		name = "Guitar";
		owned = true;
		instrument = new Instrument(name, owned);
		assertNotNull("\t\tTest_Instrument.testAccessor: Instrument is null", instrument);
		assertTrue("\t\tTest_Instrument.testAccessors.getInstrumentOwned Failed", instrument.getInstrumentOwned() == owned);
		assertTrue("\t\tTest_Instrument.testAccessors.getInstrument Failed", instrument.getInstrument() == name);
	}
}
