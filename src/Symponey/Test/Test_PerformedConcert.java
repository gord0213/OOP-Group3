package Symponey.Test;

import Symponey.Domain.PerformedConcert;
import junit.framework.*;

/**
 *	JUnit tests for the PerformedConcert class from the group project.
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Test_PerformedConcert extends TestCase{

	private PerformedConcert performedConcert;
	
	public Test_PerformedConcert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_PerformedConcert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_PerformedConcert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_PerformedConcert End");	}
	
}//end of Test_PerformedConcert
