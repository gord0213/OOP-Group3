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
	
	public Person(String id, Address homeAddress, PhoneNumber phoneNumber, String gender, Date date){
		super();
		
		address.add(homeAddress);
		this.phoneNumber.add(phoneNumber);		
		this.gender = gender;
		this.DOB = date;
		
	}//end Person constructor
	
	
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
		return name.getName();
	}//end getName method
	
	//NOT DONE YET
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
	
	public void setName(String Name){
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
	
}//end Person class
