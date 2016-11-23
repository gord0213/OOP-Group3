package Symponey.Test;

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
	
}//end of Test_Venue
