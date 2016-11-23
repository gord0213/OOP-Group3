package Symponey.Test;



import Symponey.Domain.Address;
import Symponey.Domain.Conductor;
import Symponey.Domain.Instrument;
import Symponey.Domain.Name;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Conductor extends TestCase {
	
	private Conductor conductor;
	private Person per;
	public Test_Conductor(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Ticket.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Conductor Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Conductor End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		per = new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name")));
		conductor = new Conductor(per, new Instrument("toot", false),"Jim Bob");
		assertNotNull("\t\tTest_Conductor.testConstructors: model is null", conductor);
	}
	
	
}
