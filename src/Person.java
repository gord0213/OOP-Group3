import java.util.Date;

public class Person extends ID{

	private PhoneNumber phoneNumber;
	private Name name;
	private Address address;
	
	private String gender;
	private Date DOB;
	
	public Person(String id, Address homeAddress, int phoneNumber, String gender, String date){
		super(id);
		
		this.address = new Address();
		this.phoneNumber = new PhoneNumber();
		this.name = new Name();
		
		this.address = homeAddress;
		this.phoneNumber = phoneNumber;
		
		this.gender = gender;
		//this.DOB = date;
		
	}//end Person constructor
	
	public String getGender(){
		return this.gender;
	}//end getGender method
	
	public PhoneNumber getphoneNumber(int i){
		return this.phoneNumber.getPhoneNumber();
		//int i ??????
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
