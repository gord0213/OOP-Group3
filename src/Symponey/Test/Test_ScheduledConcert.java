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
	
}//end of Test_ScheduledConcert
