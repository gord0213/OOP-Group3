package Symponey.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import Symponey.Domain.Name;
import Symponey.Domain.Seat;
import Symponey.Domain.Ticket;
import Symponey.Domain.Transaction;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Transaction extends TestCase{
	
	
	private Transaction transaction;
	private Ticket ticket;
	private Seat seat;
	private Date date;
	private Name name;
	public Test_Transaction(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Transaction.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Transaction Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Transaction End");	}

	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Transaction.testConstructors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		transaction = new Transaction("online", name, 15.00, ticket);
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: model is null", transaction);
	}
	
	public void testAccessors(){
		System.out.println("\t Executing Test_Transaction.testAccessors");
		seat = new Seat(400.00,"A777");
		date = new Date();
		ticket = new Ticket(seat,date);
		transaction = new Transaction("online", name, 15.00, ticket);
		String time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		assertNotNull("\t\tTest_Transaction.testAccessor: Transaction is null", transaction);
		assertTrue("\t\tTest_Transaction.testAccessors.getID Failed", transaction.getLedgerAccount() == "online");
		assertTrue("\t\tTest_Transaction.testAccessors.getID Failed", transaction.getTime().substring(0, 10).equals("2016.11.23"));
		assertTrue("\t\tTest_Transaction.testAccessors.getID Failed", transaction.getName() == name);
		assertTrue("\t\tTest_Transaction.testAccessors.getID Failed", transaction.getTicket(5) == ticket);
		assertTrue("\t\tTest_Transaction.testAccessors.getID Failed", transaction.getPrice() == 15.00);
	}
}
