package Symponey.Test;



import Symponey.Domain.Conductor;
import junit.framework.*;
import Symponey.Domain.Movement;

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
		
		mov = new Movement("test movement");
		assertNotNull("\t\tTest_Conductor.testConstructors: Movement object mov is null", mov);
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
		
		//----------------------------------------testing getNname----------------------------------------------
		mov = new Movement("test movement");
		mov2 = new Movement("Second movement");
		
		assertFalse("\t\tTest_Movement.testGetters.getName test 1 Failed", mov.getName() == mov2.getName());
		
		assertTrue("\t\tTest_Movement.testGetters.getName test 2 Failed", mov.getName() == "test movement");
		
		//----------------------------------------testing getNname----------------------------------------------
		mov = new Movement("test movement");
		mov2 = new Movement("Second movement");
		
		mov.setName("new name");
		assertFalse("\t\tTest_Movement.testGetters.setName test 1 Failed", mov.getName() == "test movement");
				
		assertTrue("\t\tTest_Movement.testGetters.setName test 2 Failed", mov.getName() == "new name");
	}//end of constructor
	
}
