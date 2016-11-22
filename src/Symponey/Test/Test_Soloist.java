package Symponey.Test;

import java.util.Date;

import Symponey.Domain.Soloist;
import Symponey.Domain.Ticket;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Soloist extends TestCase{
	private Soloist soloist;
	private Person person;
	private String instrumentExpertise;
	public Test_Soloist(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Soloist.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Ticket Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Ticket End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		person = new Person();
		soloist = new Soloist(per);
		assertNotNull("\t\tTest_Ticket.testConstructors: model is null", soloist);
	}
	
	public void testAccessors(){
		System.out.println("\t Executing Test_Ticket.testAccessors");
		person = new Person();
		soloist = new Soloist(per);
		instrumentExpertise = "Guitar";
		soloist.setExpertise(instrumentExpertise);
		assertNotNull("\t\tTest_Ticket.testAccessor: Ticket is null", soloist);
		assertTrue("\t\tTest_Solosist.testAccessor Failed", soloist.getExpertise() == instrumentExpertise);
	}
}
