package Symponey.Test;

import java.util.ArrayList;
import java.util.Date;

import Symponey.Domain.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TicketSaleController extends TestCase {
	
	
	public Test_TicketSaleController(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_TicketSaleController.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsModel Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsModel End");	}
	
	 /* ATTRIBUTES	-----------------------------------------------	*/
		private ArrayList<Account> acc = new ArrayList<Account>();
		private ArrayList<Transaction> trans = new ArrayList<Transaction>();
		private ArrayList<ConcertSeason> con = new ArrayList<ConcertSeason>();
		private ConcertSeason conSeason = new ConcertSeason(new Date());
		
		private TicketSaleController controller = new TicketSaleController(conSeason);

		public void testConstructors() {
		      System.out.println("\tExecuting Test_TicketSaleController.testConstructors");
		      con.add(new ConcertSeason(new Date()));
		      controller = new TicketSaleController(con.get(0));
				assertNotNull("\t\tTest_TicketSaleController: controller is null", controller); 
			      System.out.println(controller);

			}
		
		public void testAccessors() {
		      System.out.println("\tExecuting Test_TicketSaleController.testAccessors");
		      Movement move = new Movement("Temp"); // This is the simplest class with the ID
		      assertNull("\t\tTest_TicketSaleController.Accessors get account: should be null",controller.getAccount(0));// should me null because none have been added in
		      assertNull("\t\tTest_TicketSaleController.Accessors get FreeSeats: should be null",controller.getFreeSeats(move.getID()));	// null not impleemented		
		      assertNull("\t\tTest_TicketSaleController.Accessors get Musician: should be null",controller.getMusician(move.getID()));	// null not impleemented		
		      assertNull("\t\tTest_TicketSaleController.Accessors get Musician: should be null",controller.getSeatsForConcert());	// null not impleemented		
		      assertNull("\t\tTest_TicketSaleController.Accessors get Musician: should be null",controller.getTakenSeats(move.getID()));	// null not impleemented
		      Name name = new Name("Michael", "Richer", "Lawerence", "Mr");
		      PhoneNumber num = new PhoneNumber(1, 613, 662, 8337, "Cell Phone");
		      Account acc = new Account(name, "Michaelricher101@gmail.com", num);
		      controller.addAccount(acc);
		      assertNotNull("\t\tTest_TicketSaleController.Accessors get account: should be null",controller.getAccount(0));// should me not null since something has been added in;
		}
		
		/**
		 * Test the mutators/modifiers.
		 */
		public void testMutators() {
			   System.out.println("\tExecuting tTest_TicketSaleController.testMutators");
			   Composition tempComp = new Composition("Bach");
			   Concert tempCon = new Concert("Cats", tempComp);
			   Address tempAdd = new Address("Grisdale blvd.","", "K0E 1K0", "Canada", "Ontario", "", "R.R#1", "Home");
			   Name tempName = new Name("Michael" , "Lawerence", "Richer", "Mr");
			   PersonBuilder build = new PersonBuilder(tempAdd,tempName);
			   build.gender("Male");
			   Person tempPer  =build.build();
			   Instrument tempIntra = new Instrument("Clarinet", true);
			   Musician tempMus = new Musician(tempPer,tempIntra, "The one" );
			   tempCon.addMusician(tempMus);
			   Soloist tempSolo = new Soloist(tempPer,tempIntra, "The Best" );
			   tempComp.addSoloist(tempSolo);
			   Conductor tempConductor = new Conductor(tempPer,tempIntra, "The Holy One" );
			   tempComp.setConductor(tempConductor);
			   Movement tempMove = new Movement("Move one");
			   tempComp.addMovement(tempMove);
			   tempMove = new Movement("Move two");
			   tempComp.addMovement(tempMove);
			   tempMove = new Movement("Move three");
			   tempComp.addMovement(tempMove);
			   tempCon.addComposition(tempComp);
			   
			   tempAdd = new Address("Woodroffe","", "K2J 3G5", "Canada", "Ontario", "", "", "Word");
			   Seat tempSeat= new Seat(120.0, "A01") ;
			   
			   Venue tempVenue = new Venue(tempAdd, "Student Commons",tempSeat );
			   tempIntra = new Instrument("Grand Piano", true);
			   tempVenue.addInstrument(tempIntra);
			   ScheduledConcert schedCon = new ScheduledConcert(tempCon, new Date(), new Date().getTime(), tempVenue);
			   
			   
				assertEquals("\t\tTest_TicketSaleController.Mutators setsignaltonoise: equals 200" ,shannonsModel1.getSignalToNoise(), 200.0);
				assertEquals("\t\tTest_TicketSaleController.Mutators setBandWidth: equals 100" ,shannonsModel1.getBandWidth(), 100.0);
				

		
		
		}
		}
	
		
		public static void main(String[] args) {
		      System.out.println("Executing Test_TicketSaleController suite");
		      junit.textui.TestRunner.run(suite());
		  }

}
