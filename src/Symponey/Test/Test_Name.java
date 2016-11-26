package Symponey.Test;

import Symponey.Domain.Name;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Name extends TestCase{
	
	private Name name;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutations;
	
	public Test_Name(String paramString){super(paramString);}//end TestAddress
	
	public static Test suite(){return new TestSuite(Test_Address.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_Name Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_Name End");}//end tearDown
	
	/** This method tests Address constructors*/
	public void testConstructors(){
		System.out.println("\tTesting Test_Name: Constructors");
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		
		this.name = new Name(firstName, lastName, middleName, salutations);
		
		assertNotNull("\t\tTest_Name.testConstructors: Name is null", name);
	}//end testConstructors
	
	/** This method tests Name accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_Name: Accessors");
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		
		this.name = new Name(firstName, lastName, middleName, salutations);
		
		assertNotNull("\t\tTest_Name.testConstructors: Name is null", name);
		assertTrue("\t\tTest_Name.testAccessors: getFirstName equals one", name.getFirstName() == "one");
		assertTrue("\t\tTest_Name.testAccessors: getLastName equals two", name.getLastName() == "two");
		assertTrue("\t\tTest_Name.testAccessors: getMiddleName equals three", name.getMiddleName() == "three");
		assertTrue("\t\tTest_Name.testAccessors: getSalutation equals four", name.getSalutation() == "four");
		assertTrue("\t\tTest_Name.testAccessors: getName equals four", name.getName() == "four. one three two");
	}//end testAccessors
	
	/** This method tests Name mutators methods*/
	public void testMutators(){
		System.out.println("\tTesting tTest_ShannonsModel: Mutators");
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		
		this.name = new Name(firstName, lastName, middleName, salutations);
		
		this.name.setFirstName(firstName);
		this.name.setLastName(lastName);
		this.name.setMiddleName(middleName);
		this.name.setSalutation(salutations);
		
		assertNotNull("\t\tTest_Name.testConstructors: Name is null", name);
		assertTrue("\t\tTest_Name.testAccessors: getFirstName equals one", name.getFirstName() == "one");
		assertTrue("\t\tTest_Name.testAccessors: getLastName equals two", name.getLastName() == "two");
		assertTrue("\t\tTest_Name.testAccessors: getMiddleName equals three", name.getMiddleName() == "three");
		assertTrue("\t\tTest_Name.testAccessors: getSalutation equals four", name.getSalutation() == "four");
		assertTrue("\t\tTest_Name.testAccessors: getName equals four", name.getName() == "four. one three two");
	}//end testAccessors
}
