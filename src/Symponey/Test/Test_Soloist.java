package Symponey.Test;

import java.util.Date;

import Symponey.Domain.Address;
import Symponey.Domain.Instrument;
import Symponey.Domain.Name;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
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
		soloist = new Soloist(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", true), "whoknows");
		assertNotNull("\t\tTest_Ticket.testConstructors: model is null", soloist);
	}
	
	public void testAccessors(){
		System.out.println("\t Executing Test_Ticket.testAccessors");
		person = new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name")));
		soloist = new Soloist(person, new Instrument("toot", true), "whoknows");
		instrumentExpertise = "toot";
		assertNotNull("\t\tTest_Ticket.testAccessor: Ticket is null", soloist);
		assertTrue("\t\tTest_Solosist.testAccessor Failed", soloist.getExpertise() == instrumentExpertise);
	}
}
