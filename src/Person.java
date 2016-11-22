import java.util.ArrayList;
import java.util.Date;

public class Person extends ID{

	private ArrayList<PhoneNumber> phoneNumber;
	private Name name;
	private Address address;
	
	private String gender;
	private Date DOB;
	
	public Person(String id, Address homeAddress, PhoneNumber phoneNumber, String gender, Date date){
		super();
		
		this.address = homeAddress;
		this.phoneNumber.add(phoneNumber);		
		this.address = homeAddress;		
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
		return this.name.getName();
	}//end getName method
	
	//NOT DONE YET
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
	
	public void setName(String Name){
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
	
}//end Person class
