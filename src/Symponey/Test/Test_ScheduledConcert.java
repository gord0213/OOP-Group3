package Symponey.Test;





import java.sql.Time;
import java.util.Date;

import Symponey.Domain.Address;
import Symponey.Domain.Composition;
import Symponey.Domain.Concert;
import Symponey.Domain.ScheduledConcert;
import Symponey.Domain.Seat;
import Symponey.Domain.Venue;
import junit.framework.*;

/**
 *	JUnit tests for the ScheduledConcert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_ScheduledConcert extends TestCase{
	
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
		
		scheduledConcert = new ScheduledConcert(concert, new Date(1346684121), new Time(3489), venue = new Venue(add, "venue1", seat));
		scheduledConcert2 = new ScheduledConcert(concert2, new Date(34489574), new Time(3489), venue = new Venue(add2, "venue2", seat2));
		
		assertNotNull("\t\tTest_ScheduledConcert.testConstructors: ScheduledConcert object mov is null", scheduledConcert);
	}//end of test constructor
	
}//end of Test_ScheduledConcert
