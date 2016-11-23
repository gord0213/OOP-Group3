package Symponey.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.CreditToAccount;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_CreditToAccount extends TestCase{
	private CreditToAccount creditToAccount;
	private Ticket ticket;
	private Seat seat;
	private Date date;
	private Name name;
	
	public Test_CreditToAccount(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_CreditToAccount.class);		}

	protected void setUp() throws Exception { System.out.println("CreditToAccount Begin");	}

	protected void tearDown() throws Exception { System.out.println("CreditToAccount End");	}
	
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting CreditToAccount.testConstructors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		creditToAccount = new CreditToAccount("online", name, 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", creditToAccount);
	}
	

}
