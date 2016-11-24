package Symponey.Test;

import java.util.Date;

import Symponey.Domain.Address;
import Symponey.Domain.Composition;
import Symponey.Domain.Concert;
import Symponey.Domain.PerformedConcert;
import Symponey.Domain.ScheduledConcert;
import Symponey.Domain.Seat;
import Symponey.Domain.Venue;
import junit.framework.*;

/**
 *	JUnit tests for the PerformedConcert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_PerformedConcert extends TestCase{

	private PerformedConcert performedConcert, performedConcert2;
	private ScheduledConcert scheduledConcert;
	private ScheduledConcert scheduledConcert2;
	private Concert concert;
	private Composition comp1 = new Composition("Eyyyyy");
	private Concert concert2;
	private Composition comp2 = new Composition("Booooooiiii");
	private Venue venue, venue2;
	private Address add = new Address("1", "1", "1", "1", "1", "1", "1", "blah");
	private Address add2 = new Address("1", "1", "1", "1", "1", "1", "1", "second");
	private Seat seat = new Seat(23, "G");
	private Seat seat2 = new Seat(15, "F");
	
	public Test_PerformedConcert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_PerformedConcert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_PerformedConcert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_PerformedConcert End");	}
	

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_PerformedConcert.testConstructors");
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
		performedConcert = new PerformedConcert(scheduledConcert, new Date(35416), new Long(20144));
		performedConcert2 = new PerformedConcert(scheduledConcert2, new Date(4275), new Long(44752));
		
		assertNotNull("\t\tTest_PerformedConcert.testConstructors: PerformedConcert object mov is null", performedConcert);
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
		performedConcert = new PerformedConcert(scheduledConcert, new Date(35416), new Long(20144));
		performedConcert2 = new PerformedConcert(scheduledConcert2, new Date(4275), new Long(44752));
		
		assertFalse("\t\tTest_PerformedConcert.testGetters.getID test 1 Failed", performedConcert.getID() == performedConcert2.getID());
		
		performedConcert2 = performedConcert;
		assertTrue("\t\tTest_PerformedConcert.testGetters.getID test 2 Failed", performedConcert.getID() == performedConcert2.getID());
		
		//----------------------------------------testing getPerformedDate----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
		performedConcert = new PerformedConcert(scheduledConcert, new Date(35416), new Long(20144));
		performedConcert2 = new PerformedConcert(scheduledConcert2, new Date(4275), new Long(44752));
				
		assertFalse("\t\tTest_PerformedConcert.testGetters.getPerformedDate test 1 Failed", performedConcert.getPerformedDate() == performedConcert2.getPerformedDate());
				
		performedConcert2 = performedConcert;
		assertTrue("\t\tTest_PerformedConcert.testGetters.getPerformedDate test 2 Failed", performedConcert.getPerformedDate() == performedConcert2.getPerformedDate());
		
		//----------------------------------------testing getPerformedTime----------------------------------------------
		concert = new Concert("concert1", comp1);
		concert2 = new Concert("concert2", comp2);
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Long(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Long(4389), venue2 = new Venue(add2, "venue2", seat2));
		performedConcert = new PerformedConcert(scheduledConcert, new Date(35416), new Long(20144));
		performedConcert2 = new PerformedConcert(scheduledConcert2, new Date(4275), new Long(44752));
						
		assertFalse("\t\tTest_PerformedConcert.testGetters.getPerformedTime test 1 Failed", performedConcert.getPerformedTime() == performedConcert2.getPerformedTime());
						
		performedConcert2 = performedConcert;
		assertTrue("\t\tTest_PerformedConcert.testGetters.getPerformedTime test 2 Failed", performedConcert.getPerformedTime() == performedConcert2.getPerformedTime());
	}//end of test getters
	
}//end of Test_PerformedConcert
