package Symponey.Test;

import Symponey.Domain.Address;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Address extends TestCase{

	private Address address;
	
	private String streetName;
	private String aprtNum;
	private String postalCode;
	private String country;
	private String province;
	private String poBox;
	private String rr;
	private String name;
	
	public Test_Address(String paramString){super(paramString);}//end Test_Address
	
	public static Test suite(){return new TestSuite(Test_Address.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_Address Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_Address End");}//end tearDown
	
	/** This method tests Address constructors*/
	public void testConstructors(){
		System.out.println("\tTesting Test_Address: Constructors");
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name = "eight";
		
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name);
		
		assertNotNull("\t\tTest_Address.testConstructors: Address is null", address);
	}//end testConstructors
	
	/** This method tests Address accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_Address: Accessors");
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name = "eight";
		
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name);
		
		assertNotNull("\t\tTest_Address.testConstructors: Address is null", address);
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", address.getStreetName() == "one");
		assertTrue("\t\tTest_Address.testAccessors: getAprtNumber equals two", address.getAprtNumber() == "two");
		assertTrue("\t\tTest_Address.testAccessors: getPostalCode equals three", address.getPostalCode() == "three");
		assertTrue("\t\tTest_Address.testAccessors: getCountry equals four", address.getCountry() == "four");
		assertTrue("\t\tTest_Address.testAccessors: getProvince equals five", address.getProvince() == "five");
		assertTrue("\t\tTest_Address.testAccessors: getPOBox equals six", address.getPOBox() == "six");
		assertTrue("\t\tTest_Address.testAccessors: getRR equals seven", address.getRR() == "seven");
		assertTrue("\t\tTest_Address.testAccessors: getName equals eight", address.getName() == "eight");
	}//end testAccessors
	
	/** This method tests Address mutators methods*/
	public void testMutators(){
		System.out.println("\tTesting Test_Address: Mutators");
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name = "eight";
		
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name);
		
		this.address.setStreetName(streetName);
		this.address.setAprtNumber(aprtNum);
		this.address.setPostalCode(postalCode);
		this.address.setCountry(country);
		this.address.setProvince(province);
		this.address.setPOBox(poBox);
		this.address.setRR(rr);
		this.address.setName(name);
		
		assertNotNull("\t\tTest_Address.testConstructors: Address is null", address);
		assertTrue("\t\tTest_Address.testMutators: getStreetName equals one", address.getStreetName() == "one");
		assertTrue("\t\tTest_Address.testMutators: getAprtNumber equals two", address.getAprtNumber() == "two");
		assertTrue("\t\tTest_Address.testMutators: getPostalCode equals three", address.getPostalCode() == "three");
		assertTrue("\t\tTest_Address.testMutators: getCountry equals four", address.getCountry() == "four");
		assertTrue("\t\tTest_Address.testMutators: getProvince equals five", address.getProvince() == "five");
		assertTrue("\t\tTest_Address.testMutators: getPOBox equals six", address.getPOBox() == "six");
		assertTrue("\t\tTest_Address.testMutators: getRR equals seven", address.getRR() == "seven");
		assertTrue("\t\tTest_Address.testMutators: getName equals eight", address.getName() == "eight");
	}//end testAccessors
	
}//end Test_Address test class
