package Symponey.Test;

import Symponey.Domain.ScheduledConcert;
import junit.framework.*;

/**
 *	JUnit tests for the ScheduledConcert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_ScheduledConcert extends TestCase{
	
	private ScheduledConcert scheduledConcert;

	public Test_ScheduledConcert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_ScheduledConcert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ScheduledConcert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ScheduledConcert End");	}
	
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_ScheduledConcert.testConstructors");
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
		
		assertNotNull("\t\tTest_ScheduledConcert.testConstructors: ScheduledConcert object mov is null", scheduledConcert);
	}//end of test constructor
	
	/**
 	 * Test the getters.
 	 */
	public void testGetters() {
		System.out.println("\tExecuting Test_ScheduledConcert.testGetters");
		
		//----------------------------------------testing getID----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
		
		assertFalse("\t\tTest_Concert.testScheduledConcert.getID test 1 Failed", scheduledConcert.getID() == scheduledConcert2.getID());
		
		scheduledConcert2 = scheduledConcert;
		assertTrue("\t\tTest_ScheduledConcert.testGetters.getID test 2 Failed", scheduledConcert.getID() == scheduledConcert2.getID());
		
		//----------------------------------------testing getConcert----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
				
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
				
		assertFalse("\t\tTest_ScheduledConcert.testGetters.getConcert test 1 Failed", scheduledConcert.getConcert() == scheduledConcert2.getConcert());
				
		scheduledConcert2 = scheduledConcert;
		assertTrue("\t\tTest_ScheduledConcert.testGetters.getConcert test 2 Failed", scheduledConcert.getConcert() == scheduledConcert2.getConcert());
		
		//----------------------------------------testing getVenue----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
						
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
						
		assertFalse("\t\tTest_ScheduledConcert.testGetters.getVenue test 1 Failed", scheduledConcert.getVenue() == scheduledConcert2.getVenue());
						
		scheduledConcert2 = scheduledConcert;
		assertTrue("\t\tTest_ScheduledConcert.testGetters.getVenue test 2 Failed", scheduledConcert.getVenue() == scheduledConcert2.getVenue());
		
		//----------------------------------------testing getDate----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
								
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
								
		assertFalse("\t\tTest_ScheduledConcert.testGetters.getDate test 1 Failed", scheduledConcert.getDate() == scheduledConcert2.getDate());
								
		scheduledConcert2 = scheduledConcert;
		assertTrue("\t\tTest_ScheduledConcert.testGetters.getDate test 2 Failed", scheduledConcert.getDate() == scheduledConcert2.getDate());
		
		//----------------------------------------testing getTime----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
										
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
										
		assertFalse("\t\tTest_ScheduledConcert.testGetters.getTime test 1 Failed", scheduledConcert.getTime() == scheduledConcert2.getTime());
										
		scheduledConcert2 = scheduledConcert;
		assertTrue("\t\tTest_ScheduledConcert.testGetters.getTime test 2 Failed", scheduledConcert.getTime() == scheduledConcert2.getTime());
	}//end of test getters
	
	/**
 	 * Test the Setters.
 	 */
	public void testSetters() {
		System.out.println("\tExecuting Test_ScheduledConcert.testSetters");
		
		
		//----------------------------------------testing setVenue----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
						
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = scheduledConcert;
						
		assertTrue("\t\tTest_ScheduledConcert.testSetters.setVenue test 1 Failed", scheduledConcert.getVenue() == scheduledConcert2.getVenue());
						
		scheduledConcert.setVenue(venue2);
		assertTrue("\t\tTest_ScheduledConcert.testSetters.setVenue test 2 Failed", scheduledConcert.getVenue() == venue2);
		
		//----------------------------------------testing setDate----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
								
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
								
		assertFalse("\t\tTest_ScheduledConcert.testSetters.setDate test 1 Failed", scheduledConcert.getDate() == scheduledConcert2.getDate());
								
		scheduledConcert2.setDate(scheduledConcert.getDate());
		assertTrue("\t\tTest_ScheduledConcert.testSetters.setDate test 2 Failed", scheduledConcert.getDate() == scheduledConcert2.getDate());
		
		//----------------------------------------testing setTime----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
										
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
										
		assertFalse("\t\tTest_ScheduledConcert.testSetters.setTime test 1 Failed", scheduledConcert.getTime() == scheduledConcert2.getTime());
										
		scheduledConcert2.setTime(scheduledConcert.getTime());
		assertTrue("\t\tTest_ScheduledConcert.testSetters.setTime test 2 Failed", scheduledConcert.getTime() == scheduledConcert2.getTime());
	}//end of test Setters
	
}//end of Test_ScheduledConcert
