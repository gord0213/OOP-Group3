package Symponey.Domain;
import java.util.ArrayList;
import java.util.Date;

public class PersonBuilder{
	
	protected ArrayList<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
	protected Name name;
	protected ArrayList<Address> address = new ArrayList<Address>();
	protected String gender;
	protected Date DOB;
	
	public PersonBuilder(Address address, Name name){
		this.address.add(address);
		this.name =name; 
	}//end PersonBuilder constructor
	
	public PersonBuilder gender(String gender){
		this.gender = gender;
		return this;
	}//end gender method
	
	public PersonBuilder dob(Date dob){

		this.person.setDOB(dob);

		DOB = dob;

		return this;
	}//end dob method
	
	public PersonBuilder name(Name name){
		this.name = name;
		return this;
	}//end name method
	
	public PersonBuilder salutation(String salutation){
		name.setSalutation(salutation);
		return this;
	}//end salutation method
	
	public PersonBuilder address(Address address){
		this.address.add(address);
		return this;
	}//end address method
	
	public Person build(){
		
		return new Person(this);
		
	}//end gender method
	
}//end PersonBuilder class
