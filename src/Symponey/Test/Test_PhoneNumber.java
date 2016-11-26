package Symponey.Test;

import Symponey.Domain.PhoneNumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_PhoneNumber extends TestCase{
	
	private PhoneNumber phoneNumber;
	private int nationCode; 
	private int regionCode; 
	private int areaCode; 
	private int lastFour; 
	private String name; 
	
	public Test_PhoneNumber(String paramString){super(paramString);}//end Test_PhoneNumber
	
	public static Test suite(){return new TestSuite(Test_Address.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_PhoneNumber Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_PhoneNumber End");}//end tearDown
	
	/** This method tests Address constructors*/
	public void testConstructors(){
		System.out.println("\tTesting Test_PhoneNumber: Constructors");
		
		nationCode = 1; 
		regionCode = 234; 
		areaCode = 567; 
		lastFour = 8910;
		name = "name";
		
		this.phoneNumber = new PhoneNumber(nationCode, regionCode, areaCode, lastFour, name);
		
		assertNotNull("\t\tTest_PhoneNumber.testConstructors: PhoneNumber is null", phoneNumber);
	}//end testConstructors
	
	/** This method tests Address accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_PhoneNumber: Accessors");
		
		nationCode = 1; 
		regionCode = 234; 
		areaCode = 567; 
		lastFour = 8910;
		name = "name";
		
		this.phoneNumber = new PhoneNumber(nationCode, regionCode, areaCode, lastFour, name);
		
		assertNotNull("\t\tTest_Address.testConstructors: Address is null", phoneNumber);
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", phoneNumber.getPhoneNumber() == "+"+ nationCode +"-("+ regionCode +")"+ areaCode+ "-"+ lastFour);
		assertTrue("\t\tTest_Address.testAccessors: getName equals eight", phoneNumber.getName() == "name");
	}//end testAccessors
	
}//end Test_PhoneNumber test class
