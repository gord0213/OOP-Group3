package Symponey.Domain;
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
	public Person(Person per)
	{
		int i =0;
		while(per.getAddress(i) != null)
		{
			this.setAddress(per.getAddress(i));
			i++;
		}
		i=0;
		while(per.getphoneNumber(i) != null)
		{
			this.setPhoneNumber(per.getphoneNumber(i));
			i++;
		}
		name = per.getName();
		gender = per.getGender();
		DOB = per.getDOB();
		
		
		
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
		return 0;
	}//end getAge method
	
	public Date getDOB(){
		return this.DOB;
	}//end getDOB method
	
	public String getSalutation(){
		return this.name.getSalutation();
	}//end getSalutation method
	
	public Address getAddress(int i){
		return this.address.getAddress();
		//int i ????
	}//end getAddress method
	
	public void setName(Name Name){
		this.name = Name;
	}//end setName method
	
	public void setAddress(Address address){
		this.address = address;
	}//end setAddress method
	
	public void setPhoneNumber(PhoneNumber num){
		this.phoneNumber = num;
	}//end setPhoneNumber method
	
	public void setID(int id){
		
	}//end setID method
	
	public void setDOB(Date date){
		this.DOB = date;
	}//end setDOB method
	
	public void setGender(String gender){
		this.gender = gender;
	}//end setGender method
	
	public void setDOB(Date dob)
	{
		this.DOB = dob;
	}
	
}//end Person class
