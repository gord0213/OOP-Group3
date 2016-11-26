package Symponey.Test;

import java.util.ArrayList;
import java.util.Date;

import Symponey.Domain.Address;
import Symponey.Domain.Instrument;
import Symponey.Domain.Musician;
import Symponey.Domain.Name;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
import Symponey.Domain.PhoneNumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Person extends TestCase{
	
	private Person person;
	private PersonBuilder builder;
	private Address address;
	private Name nameClass;
	
	private ArrayList<PhoneNumber> phoneNumberArray = new ArrayList<PhoneNumber>();
	private ArrayList<Address> addressArray = new ArrayList<Address>() ;
	private String gender;
	private Date DOB;
	private PhoneNumber phoneNumber;
	
	private int nationCode; 
	private int regionCode; 
	private int areaCode; 
	private int lastFour; 
	private String name; 
	
	private String streetName;
	private String aprtNum;
	private String postalCode;
	private String country;
	private String province;
	private String poBox;
	private String rr;
	private String name2;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutations;
	
	public Test_Person(String paramString){super(paramString);}//end Test_Musician
	
	public static Test suite(){return new TestSuite(Test_Person.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_Person Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_Person End");}//end tearDown
	
	public void testConstructors(){
		System.out.println("\tTesting Test_Person: Constructors");
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name2 = "eight";
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name2);
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		this.nameClass = new Name(firstName, lastName, middleName, salutations);
		
		this.builder = new PersonBuilder(address, nameClass);
		this.person = new Person(builder);
		
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
		
		this.person = new Person(person);
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
	}//end testConstructors
	
	/** This method tests Address accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_Person: Accessors");
		
		gender = "male";
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name2 = "eight";
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name2);
		
		nationCode = 1; 
		regionCode = 234; 
		areaCode = 567; 
		lastFour = 8910;
		name = "name";
		this.phoneNumber = new PhoneNumber(nationCode, regionCode, areaCode, lastFour, name);
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		this.nameClass = new Name(firstName, lastName, middleName, salutations);
		
		this.builder = new PersonBuilder(address, nameClass);
		this.person = new Person(builder);
		
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
		
		this.person = new Person(person);
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
		
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getGender() == "male");
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getphoneNumber(1) == phoneNumberArray.get(1));
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getName() == nameClass);
		assertNotNull("\t\tTest_Address.testAccessors: getStreetName equals one", person.getAge());
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getDOB() == DOB);
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getSalutation() == "four");
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getAddress(1) == addressArray.get(1));
	}//end testAccessors
	
	/** This method tests Address mutator methods*/
	public void testMutators(){
		System.out.println("\tTesting Test_Person: Accessors");
		
		gender = "male";
		
		streetName = "one";
		aprtNum = "two";
		postalCode = "three";
		country = "four";
		province = "five";
		poBox = "six";
		rr = "seven";
		name2 = "eight";
		this.address = new Address(streetName, aprtNum, postalCode, country, province, poBox, rr, name2);
		
		nationCode = 1; 
		regionCode = 234; 
		areaCode = 567; 
		lastFour = 8910;
		name = "name";
		this.phoneNumber = new PhoneNumber(nationCode, regionCode, areaCode, lastFour, name);
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		this.nameClass = new Name(firstName, lastName, middleName, salutations);
		
		this.builder = new PersonBuilder(address, nameClass);
		this.person = new Person(builder);
		
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
		
		this.person = new Person(person);
		assertNotNull("\t\tTest_Person.testConstructors: person is null", person);
		
		person.setName(nameClass);
		person.setAddress(address);
		person.setPhoneNumber(phoneNumber);
		person.setGender(gender);
		person.setDOB(DOB);
		
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getGender() == "male");
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getphoneNumber(1) == phoneNumberArray.get(1));
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getName() == nameClass);
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getDOB() == DOB);
		assertTrue("\t\tTest_Address.testAccessors: getStreetName equals one", person.getAddress(1) == addressArray.get(1));
	}//end testMutators
	
}//end Test_Person test class
