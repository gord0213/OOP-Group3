package Symponey.Test;

import Symponey.Domain.Address;
import Symponey.Domain.BalconySeat;
import Symponey.Domain.BoothSeat;
import Symponey.Domain.Composition;
import Symponey.Domain.Instrument;
import Symponey.Domain.Seat;
import Symponey.Domain.Venue;
import junit.framework.*;

/**
 *	JUnit tests for the Venue class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_Venue extends TestCase{

	private Venue venue;
	
	public Test_Venue(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Venue.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Venue Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Venue End");	}
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Venue.testConstructors");
		
		venue = new Venue(add, "name", seat);
		assertNotNull("\t\tTest_Venue.testConstructors: Venue object mov is null", venue);
	}//end of test constructor
	
	
	/**
 	 * Test the getters.
 	 */
	public void testGetters() {
		System.out.println("\tExecuting Test_Venue.testGetters");
		
		//----------------------------------------testing getID----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add, "name2", seat);
		
		assertFalse("\t\tTest_Venue.testGetters.getID test 1 Failed", venue.getID() == venue2.getID());
		
		venue2 = venue;
		assertTrue("\t\tTest_Venue.testGetters.getID test 2 Failed", venue.getID() == venue2.getID());
		
		//----------------------------------------testing getAddress----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
				
		assertFalse("\t\tTest_Venue.testGetters.getAddress test 1 Failed", venue.getAddress() == venue2.getAddress());
				
		assertTrue("\t\tTest_Venue.testGetters.getAddress test 2 Failed", venue.getAddress() == add);
		
		//----------------------------------------testing getAddress----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
						
		assertFalse("\t\tTest_Venue.testGetters.getName test 1 Failed", venue.getName() == venue2.getName());
						
		assertTrue("\t\tTest_Venue.testGetters.getName test 2 Failed", venue.getName() == "name");
		
		//----------------------------------------testing getSeat----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addSeat(seat);
						
		assertFalse("\t\tTest_Venue.testGetters.getSeat test 1 Failed", venue.getSeat(0) == venue2.getSeat(0));
						
		assertTrue("\t\tTest_Venue.testGetters.getSeat test 2 Failed", venue.getSeat(0) == venue2.getSeat(1));
		
		//----------------------------------------testing getInstrument----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue.addInstrument(instrument);
		venue.addInstrument(instrument2);
		venue2.addInstrument(instrument2);
								
				assertFalse("\t\tTest_Venue.testGetters.getInstrument test 1 Failed", venue.getInstrument(0) == venue2.getInstrument(0));
								
				assertTrue("\t\tTest_Venue.testGetters.getInstrument test 2 Failed", venue.getInstrument(1) == venue2.getInstrument(0));
		
	}//end of test Getters
	
	/**
 	 * Test the setter.
 	 */
	public void testSetter() {
		System.out.println("\tExecuting Test_Venue.testSetter");
		
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
						
		assertFalse("\t\tTest_Venue.testSetter.setName test 1 Failed", venue.getName() == venue2.getName());
						
		venue2.setName("name");
		assertTrue("\t\tTest_Venue.testSetter.setName test 2 Failed", venue.getName() == venue2.getName());
		
	}//end of test setter
	
	/**
 	 * Test the normal behaviors.
 	 */
	public void testNormalBehaviors() {
		System.out.println("\tExecuting Test_Venue.NormalBehaviors");
		
		//----------------------------------------testing addSeat----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addSeat(seat);
		venue.addSeat(seat2);
		
		assertFalse("\t\tTest_Venue.testNormalBehaviors.addSeat test 1 Failed", venue.getSeat(0) == venue2.getSeat(0));
		
		assertTrue("\t\tTest_Venue.testNormalBehaviors.addSeat test 2 Failed", venue.getSeat(0) == venue2.getSeat(1));
		
		//----------------------------------------testing removeSeat----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addSeat(seat);
		venue.addSeat(seat2);
				
		assertFalse("\t\tTest_Venue.testNormalBehaviors.removeSeat test 1 Failed", venue.getSeat(0) == venue2.getSeat(0));
				
		venue.removeSeat(seat);
		assertTrue("\t\tTest_Venue.testNormalBehaviors.removeSeat test 2 Failed", venue.getSeat(0) == venue2.getSeat(0));
		
		//----------------------------------------testing addInstrument----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addInstrument(instrument2);
		venue.addInstrument(instrument);
				
		assertFalse("\t\tTest_Venue.testNormalBehaviors.addInstrument test 1 Failed", venue.getInstrument(0) == venue2.getInstrument(0));
		
		venue2.addInstrument(instrument);
		assertTrue("\t\tTest_Venue.testNormalBehaviors.addInstrument test 2 Failed", venue.getInstrument(0) == venue2.getInstrument(1));
				
		//----------------------------------------testing removeInstrument----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addInstrument(instrument2);
		venue.addInstrument(instrument);
		venue.addInstrument(instrument2);
						
		assertFalse("\t\tTest_Venue.testNormalBehaviors.removeInstrument test 1 Failed", venue.getInstrument(0) == venue2.getInstrument(0));
						
		venue.removeInstrument(instrument);
		assertTrue("\t\tTest_Venue.testNormalBehaviors.removeInsturment test 2 Failed", venue.getInstrument(0) == venue2.getInstrument(0));
		
		//----------------------------------------testing checkInstrument----------------------------------------------
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addInstrument(instrument2);
		venue.addInstrument(instrument);
		
								
		assertFalse("\t\tTest_Venue.testNormalBehaviors.checkInstrument test 1 Failed", venue.checkInstrument(instrument2));
								
		assertTrue("\t\tTest_Venue.testNormalBehaviors.checkInstrument test 2 Failed", venue.checkInstrument(instrument));
		
		//----------------------------------------testing venueSoldOut----------------------------------------------
		seat = new BoothSeat(24, "seat1", "booth");
		seat2 = new BalconySeat(16, "seat2", "Balcony");
		seat.Taken();
		venue = new Venue(add, "name", seat);
		venue2 = new Venue(add2, "name2", seat2);
		venue2.addSeat(seat);
		
				
		assertFalse("\t\tTest_Venue.testNormalBehaviors.venueSoldOut test 1 Failed", venue2.venueSoldOut());
				
		assertTrue("\t\tTest_Venue.testNormalBehaviors.venueSoldOut test 2 Failed", venue.venueSoldOut());
		
		venue.addSeat(seat);
		assertTrue("\t\tTest_Venue.testNormalBehaviors.venueSoldOut test 3 Failed", venue.venueSoldOut());
	}//end of test Normal Behaviors
	
}//end of Test_Venue
