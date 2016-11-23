package Symponey.Domain;
import java.util.Date;

public class PersonBuilder extends Person{
	
	private Person person;
	
	public PersonBuilder(String gender, Date dob){
		this.person = new Person();
	}//end PersonBuilder constructor
	
	public PersonBuilder gender(String gender){
		this.person.setGender(gender);
		return this;
	}//end gender method
	
	public PersonBuilder dob(Date dob){
		person.setDOB(dob);
		return this;
	}//end dob method
	
	public PersonBuilder name(String name){
		this.person.setName(name);
		return this;
	}//end name method
	
	public PersonBuilder age(int age){
		//this.person.setAge(age);
		return this;
	}//end age method
	
	public PersonBuilder salutation(String salutation){
		//this.person.setSalutation(salutation);
		return this;
	}//end salutation method
	
	public PersonBuilder address(String address){
		this.person.setAddress(address);//still int i....
		return this;
	}//end address method
	
	public Person build(){
		
	}//end gender method
	
}//end PersonBuilder class
