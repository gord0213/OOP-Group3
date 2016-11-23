package Symponey.Test;



import junit.framework.*;
import Symponey.Domain.Composition;
import Symponey.Domain.Conductor;
import Symponey.Domain.Instrument;
import Symponey.Domain.Movement;
import Symponey.Domain.Name;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
import Symponey.Domain.PhoneNumber;
import Symponey.Domain.Soloist;

/**
 *	JUnit tests for the Composition class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_Composition extends TestCase {
	
	private Composition comp, comp2;

	
	public Test_Composition(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Composition.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Composition Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Composition End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Composition.testConstructors");
		
		comp = new Composition("test comp");
		assertNotNull("\t\tTest_Composition.testConstructors: Movement object mov is null", comp);
	}//end of constructor
	
	
	/**
 	 * Test the getters.
 	 */
	public void testGetters() {
		System.out.println("\tExecuting Test_Composition.testGetters");
		
		
		
	
		
		//----------------------------------------testing getID----------------------------------------------
		comp = new Composition("test comp");
		comp2 = new Composition("second comp");
		
		assertFalse("\t\tTest_Composition.testGetters.getID test 1 Failed", comp.getID() == comp2.getID());
		
		comp2 = comp;
		assertTrue("\t\tTest_Composition.testGetters.getID test 2 Failed", comp.getID() == comp2.getID());
		
		//----------------------------------------testing getComposer----------------------------------------------
		comp = new Composition("test comp");
		comp2 = new Composition("second comp");
		
		assertFalse("\t\tTest_Composition.testGetters.getComposer test 1 Failed", comp.getComposer() == comp2.getComposer());
		
		assertTrue("\t\tTest_Composition.testGetters.getComposer test 2 Failed", comp.getComposer() == "test comp");
		
		//----------------------------------------testing getSoloist----------------------------------------------
		comp = new Composition("test comp");
		Soloist solo = new Soloist(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false), "whoknows");
		comp.addSoloist(solo);
				
		assertTrue("\t\tTest_Composition.testGetters.getSoloist test Failed", comp.getSolo(0) == solo);
		
		//----------------------------------------testing getMovement----------------------------------------------
		comp = new Composition("test comp");
		Movement mov = new Movement("movement");
		comp.addMovement(mov);
						
		assertTrue("\t\tTest_Composition.testGetters.getMovement test Failed", comp.getMovement(0) == mov);
		
		//----------------------------------------testing getApproved----------------------------------------------
		comp = new Composition("test comp");
												
		assertTrue("\t\tTest_Composition.testGetters.getApproved test Failed", comp.getApproved() == false);
				
		//----------------------------------------testing getConductor----------------------------------------------
		comp = new Composition("test comp");
		Conductor conductor = new Conductor(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false), "whoknows");
		comp.setConductor(conductor);
								
		assertTrue("\t\tTest_Composition.testGetters.getConductor test Failed", comp.getConductor() == conductor);
				
	}//end of Getters
	
	/**
 	 * Test the setters.
 	 */
	public void testSetters() {
		System.out.println("\tExecuting Test_Composition.testSetters");
		
		//----------------------------------------testing setConductor----------------------------------------------
		comp = new Composition("test comp");
		Conductor conductor = new Conductor(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false),"whoknows");
		comp.setConductor(conductor);
										
		assertTrue("\t\tTest_Composition.testSetters.SetConductor test 1 Failed", comp.getConductor() == conductor);
		
		conductor = new Conductor(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false),"whoknows");
		comp.setConductor(conductor);
		
		assertTrue("\t\tTest_Composition.testSetters.SetConductor test 2 Failed", comp.getConductor() == conductor);
		
		//----------------------------------------testing getApproved----------------------------------------------
		comp = new Composition("test comp");
		comp.setApproved(true);
		
		assertTrue("\t\tTest_Composition.testGetters.getApproved test Failed", comp.getApproved() == true);
				
	}//end of Setters
	
	/**
 	 * Test the normal behaviors.
 	 */
	public void testNormalBehaviors() {
		System.out.println("\tExecuting Test_Composition.testNormalBehaviors");
		
		//----------------------------------------testing addSoloist----------------------------------------------
		comp = new Composition("test comp");
		Soloist solo = new Soloist(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false),"whoknows");
		Soloist solo2 = new Soloist(new Person(new PersonBuilder(new Address("1", "1", "1", "1", "1", "1", "1", "blah"), new Name("name", "name", "name", "name"))),new Instrument("toot", false),"whoknows");
		comp.addSoloist(solo);
		comp.addSoloist(solo2);
				
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addSoloist test Failed", comp.getSolo(0) == solo);
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addSoloist test Failed", comp.getSolo(1) == solo2);
		
		//----------------------------------------testing removeSoloist----------------------------------------------
		comp = new Composition("test comp");
		comp.addSoloist(solo);
		comp.addSoloist(solo2);
				
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeSoloist test 1 Failed", comp.getSolo(0) == solo);
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeSoloist test 2 Failed", comp.getSolo(1) == solo2);
		
		comp.removeSoloist(solo);
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeSoloist test 3 Failed", comp.getSolo(0) == solo2);
		
		//----------------------------------------testing addMovement----------------------------------------------
		comp = new Composition("test comp");
		Movement mov = new Movement("movement");
		Movement mov2 = new Movement("movement2");
		comp.addMovement(mov);
		comp.addMovement(mov2);
						
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addMovement test 1 Failed", comp.getMovement(0) == mov);
						
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addMovement test 2 Failed", comp.getMovement(1) == mov2);
		
		Movement[] movArr = {mov, mov2};
		comp = new Composition("test comp");
		comp.addMovement(movArr);
		
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addMovement test 3 Failed", comp.getMovement(0) == mov);
		
		assertTrue("\t\tTest_Composition.testNormalBehaviors.addMovement test 4 Failed", comp.getMovement(1) == mov2);
		
		//----------------------------------------testing removeMovement----------------------------------------------
		comp = new Composition("test comp");
		comp.addMovement(mov);
		comp.addMovement(mov2);
						
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeMovement test 1 Failed", comp.getMovement(0) == mov);
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeMovement test 2 Failed", comp.getMovement(1) == mov2);
				
		comp.removeMovement(mov);
		assertTrue("\t\tTest_Composition.testNormalBehaviors.removeMovement test 3 Failed", comp.getMovement(0) == mov2);
				
	}//end of Setters
	
}//end of test_Movement
