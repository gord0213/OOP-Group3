package Symponey.Domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Person extends ID{

	private ArrayList<PhoneNumber> phoneNumber;
	private Name name;
	private ArrayList<Address> address;
	private String gender;
	private Date DOB;
	
	public Person(PersonBuilder builder)
	{
		this.phoneNumber = builder.phoneNumber;
		this.name = builder.name;
		this.address = builder.address;
		this.gender = builder.gender;
		this.DOB = builder.DOB;
	}
	
	
	
	public String getGender(){
		return this.gender;
	}//end getGender method
	
	public PhoneNumber getphoneNumber(int i){
		
		if(i<phoneNumber.size())
		{
			return phoneNumber.get(i);
		}
		else
		{
			return null;
		}
	}//end getGender method
	
	
	public Name getName(){
		return name;
	}//end getName method
	

	public int getAge(){
		return LocalDate.now().getYear() -DOB.getYear();
	}//end getAge method
	
	public Date getDOB(){
		return DOB;
	}//end getDOB method
	
	public String getSalutation(){
		return name.getSalutation();
	}//end getSalutation method
	
	public Address getAddress(int i){
		if(i<address.size())
		{
			return address.get(i) ;
		}
		else
		{
			return null;
		}
	}//end getAddress method
	
	public void setName(Name Name){
		this.name = Name;
	}//end setName method
	
	public void setAddress(Address address){
		this.address.add(address);
	}//end setAddress method
	
	public void setPhoneNumber(PhoneNumber num){
		phoneNumber.add(num);
	}//end setPhoneNumber method
	
	public void setGender(String gender){
		this.gender = gender;
	}//end setGender method
	
	public void setDOB(Date dob)
	{
		this.DOB = dob;
	}
	
}//end Person class
