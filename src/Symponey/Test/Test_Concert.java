package Symponey.Test;

import Symponey.Domain.Address;
import Symponey.Domain.Composition;
import Symponey.Domain.Concert;
import Symponey.Domain.Instrument;
import Symponey.Domain.Musician;
import Symponey.Domain.Name;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
import Symponey.Domain.Venue;
import junit.framework.*;

/**
 *	JUnit tests for the Concert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_Concert extends TestCase {

	private Concert concert;
	private Composition comp1 = new Composition("Eyyyyy");
	private Concert concert2;
	private Composition comp2 = new Composition("Booooooiiii");
	private Musician mus1 = new Musician(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))), new Instrument("toot", false), "mc Toot");
	private Musician mus2 = new Musician(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "other"), new Name("name2", "name2", "name2", "name2"))), new Instrument("boop", false), "mc boop");

	
	public Test_Concert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Concert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Concert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Concert End");	}
	
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Concert.testConstructors");
		
		concert = new Concert("concert1", comp1);
		assertNotNull("\t\tTest_Concert.testConstructors: Concert object mov is null", concert);
	}//end of test constructor
	

	/**
 	 * Test the getters.
 	 */
	public void testGetters() {
		System.out.println("\tExecuting Test_Concert.testGetters");
		
		//----------------------------------------testing getID----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		
		assertFalse("\t\tTest_Concert.testGetters.getID test 1 Failed", concert.getID() == concert2.getID());
		
		concert2 = concert;
		assertTrue("\t\tTest_Concert.Getters.getID test 2 Failed", concert.getID() == concert2.getID());
		
		//----------------------------------------testing getName----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
				
		assertFalse("\t\tTest_Concert.testGetters.getName test 1 Failed", concert.getName() == concert2.getName());
				
		assertTrue("\t\tTest_Concert.testGetters.getName test 2 Failed", concert.getName() == "concert1");
		
		//----------------------------------------testing getConcert----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
				
		assertFalse("\t\tTest_Concert.testGetters.getConcert test 1 Failed", concert.getConcert() == concert2.getConcert());
				
		concert2 = concert;
		assertTrue("\t\tTest_Concert.Getters.getConcert test 2 Failed", concert.getConcert() == concert2.getConcert());
		
		//----------------------------------------testing getComposition----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		concert.addComposition(comp2);
						
		assertFalse("\t\tTest_Concert.testGetters.getComposition test 1 Failed", concert.getComposition(0) == concert2.getComposition(0));
						
		assertTrue("\t\tTest_Concert.testGetters.getComposition test 2 Failed", concert.getComposition(1) == concert2.getComposition(0));
				
	}//end of test getters
	

	/**
 	 * Test the normal behaviors.
 	 */
	public void testNormalBehaviors() {
		System.out.println("\tExecuting Test_Concert.testNormalBehaviors");
		
		//----------------------------------------testing addComposition----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		concert.addComposition(comp2);
		concert2.addComposition(comp1);
								
		assertFalse("\t\tTest_Concert.testNormalBehaviors.addComposition test 1 Failed", concert.getComposition(0) == concert2.getComposition(0));
								
		assertTrue("\t\tTest_Concert.testNormalBehaviors.addComposition test 2 Failed", concert.getComposition(1) == concert2.getComposition(0));
		
		//----------------------------------------testing removeComposition----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		concert.addComposition(comp2);
		concert2.addComposition(comp1);
										
		assertFalse("\t\tTest_Concert.testNormalBehaviors.removeComposition test 1 Failed", concert.getComposition(0) == concert2.getComposition(0));
										
		concert.removeComposition(comp1);
		assertTrue("\t\tTest_Concert.testNormalBehaviors.removeComposition test 2 Failed", concert.getComposition(0) == concert2.getComposition(0));
		
		//----------------------------------------testing addMusician----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		concert.addMusician(mus1);
		concert2.addMusician(mus2);
										
		assertFalse("\t\tTest_Concert.testNormalBehaviors.addMusician test 1 Failed", concert.getMusician(0) == concert2.getMusician(0));
										
		assertTrue("\t\tTest_Concert.testNormalBehaviors.addMusician test 2 Failed", concert.getMusician(0) == mus1);
				
		//----------------------------------------testing removeMusician----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		concert.addMusician(mus1);
		concert2.addMusician(mus2);
		concert.addMusician(mus2);
												
		assertFalse("\t\tTest_Concert.testNormalBehaviors.removeMusician test 1 Failed", concert.getMusician(0) == concert2.getMusician(0));
												
		concert.removeMusician(mus1);
		assertTrue("\t\tTest_Concert.testNormalBehaviors.removeMusician test 2 Failed", concert.getMusician(0) == concert2.getMusician(0));
		
		//----------------------------------------testing isSame----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
				
		assertFalse("\t\tTest_Concert.testGetters.isSame test 1 Failed", concert.isSame(concert2));
				
		concert2 = concert;
		assertTrue("\t\tTest_Concert.Getters.isSame test 2 Failed", concert.isSame(concert2));
		
	}//end of test Normal Behaviors
	
}//end of test_Concert
