package Symponey.Test;

import Symponey.Domain.Concert;
import Symponey.Domain.Movement;
import junit.framework.*;

/**
 *	JUnit tests for the Concert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_Concert extends TestCase {

	private Concert concert;
	
	public Test_Concert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Concert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Concert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Concert End");	}
	
}//end of test_Concert
