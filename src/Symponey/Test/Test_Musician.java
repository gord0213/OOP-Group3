package Symponey.Test;

import java.util.ArrayList;

import Symponey.Domain.Address;
import Symponey.Domain.Instrument;
import Symponey.Domain.Musician;
import Symponey.Domain.Person;
import Symponey.Domain.PersonBuilder;
import Symponey.Domain.Name;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Musician extends TestCase{

	private ArrayList<Instrument> instrument = new ArrayList<Instrument>();
	
	private Instrument inst;
	private Person person;
	private PersonBuilder builder;
	private Musician musician;
	private Address address;
	private Name nameClass;
	
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
	
	private String stageName; 
	
	private String name;
	private boolean owned;

	
	public Test_Musician(String paramString){super(paramString);}//end Test_Musician
	
	public static Test suite(){return new TestSuite(Test_Musician.class);}//end suite

	public void setUp() throws Exception{System.out.println("Test_Musician Begin");}//end setUp

	public void tearDown() throws Exception{System.out.println("Test_Musician End");}//end tearDown
	
	public void testConstructors(){
		System.out.println("\tTesting Test_Musician: Constructors");
		
		stageName = "one";
		
		name = "name";
		owned = true;
		this.inst = new Instrument(name, owned);
		
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
		this.musician = new Musician(person, inst, stageName);
		
		assertNotNull("\t\tTest_Musician.testConstructors: Musician is null", musician);
	}//end testConstructors
	
	/** This method tests Address accessor methods*/
	public void testAccessors(){
		System.out.println("\tTesting Test_Address: Accessors");
		
		stageName = "one";
		
		name = "name";
		owned = true;
		this.inst = new Instrument(name, owned);
		
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
		this.musician = new Musician(person, inst, stageName);
		
		assertNotNull("\t\tTest_Musician.testConstructors: Musician is null", musician);
		assertTrue("\t\tTest_Musician.testAccessors: getInstrument equals 1", musician.getInstrument(1) == instrument.get(1));
		assertTrue("\t\tTest_Musician.testAccessors: getStageName equals one", musician.getStageName() == "one");
	}//end testAccessors
	
}//end Test_Musician test class
