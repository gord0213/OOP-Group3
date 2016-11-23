package Symponey.Test;



import junit.framework.*;
import Symponey.Domain.Movement;

/**
 *	JUnit tests for the Movement class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_Movement extends TestCase {
	
	private Movement mov, mov2;
	
	public Test_Movement(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Movement.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Movement Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Movement End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Movement.testConstructors");
		
		mov = new Movement("\ttest movement");
		System.out.println("\t" +mov.getID());
		System.out.println("\tIn constructor" + mov);
		assertNotNull("\t\tTest_Movement.testConstructors: Movement object mov is null", mov);
	}//end of constructor
	
	
	/**
 	 * Test the getters.
 	 */
	public void testGetters() {
		System.out.println("\tExecuting Test_Movement.testGetters");
		
		//----------------------------------------testing getID----------------------------------------------
		mov = new Movement("test movement");
		mov2 = new Movement("Second movement");
		
		assertFalse("\t\tTest_Movement.testGetters.getID test 1 Failed", mov.getID() == mov2.getID());
		
		mov2 = mov;
		assertTrue("\t\tTest_Movement.testGetters.getID test 2 Failed", mov.getID() == mov2.getID());
		
		//----------------------------------------testing getName----------------------------------------------
		mov = new Movement("test movement");
		mov2 = new Movement("Second movement");
		
		assertFalse("\t\tTest_Movement.testGetters.getName test 1 Failed", mov.getName() == mov2.getName());
		
		assertTrue("\t\tTest_Movement.testGetters.getName test 2 Failed", mov.getName() == "test movement");
		
	}//end of Getters
	
	
	/**
 	 * Test the setter.
 	 */
	public void testSetter() {
		System.out.println("\tExecuting Test_Movement.testSetter");
		
		mov = new Movement("test movement");
		mov2 = new Movement("Second movement");
			
		mov.setName("new name");
		assertFalse("\t\tTest_Movement.testSetter.setName test 1 Failed", mov.getName() == "test movement");
				
		assertTrue("\t\tTest_Movement.testSetter.setName test 2 Failed", mov.getName() == "new name");
	}//end of Setter
	
}//end of test_Movement
