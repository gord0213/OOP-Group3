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

public class Test_PersonBuilder extends TestCase{
	
	private PersonBuilder builder;
	private Address address;
	private Name nameClass;
	
	protected ArrayList<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
	protected ArrayList<Address> addressArray = new ArrayList<Address>();
	protected Name name;
	protected String gender;
	protected Date DOB;
	
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
	
	public Test_PersonBuilder(String paramString){super(paramString);}//end Test_Address
	
	public static Test suite(){return new TestSuite(Test_PersonBuilder.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_PersonBuilder Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_PersonBuilder End");}//end tearDown
	
	public void testConstructors(){
		System.out.println("\tTesting Test_PersonBuilder: Constructors");
		
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
		
		assertNotNull("\t\tTest_PersonBuilder.testConstructors: PersonBuilder is null", builder);
	}//end testConstructors
	
	/** This method tests Address accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_Address: Accessors");
		
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
		
		firstName = "one";
		lastName = "two";
		middleName = "three";
		salutations = "four";
		this.nameClass = new Name(firstName, lastName, middleName, salutations);
		
		this.builder = new PersonBuilder(address, nameClass);
		
		assertNotNull("\t\tTest_PersonBuilder.testConstructors: PersonBuilder is null", builder);
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.gender(gender));
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.dob(DOB));
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.name(nameClass));
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.salutation(gender));
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.address(address));
		assertNotNull("\t\tTest_PersonBuilder.testAccessors: gender equals one", builder.build());
	}//end testAccessors
	
}//end Test_PersonBuilder test class
