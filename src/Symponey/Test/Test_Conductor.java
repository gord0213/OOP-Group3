package Symponey.Test;



import Symponey.Domain.Conductor;
import Symponey.Domain.Person;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Conductor extends TestCase {
	
	private Conductor conductor;
	private PersonBuilder per;
	public Test_Conductor(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Ticket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Conductor Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Conductor End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		Date date = new Date(System.currentTimeMillis());
		
		per = new PersonBuilder("male", date );
		Instrument instr = new Instrument("guitar", true);
		conductor = new Conductor(per, instr , "Billy Bob");
		assertNotNull("\t\tTest_Conductor.testConstructors: model is null", conductor);
	}
	
	
}
