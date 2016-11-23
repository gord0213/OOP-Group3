package Symponey.Domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Person extends ID{

	private ArrayList<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
	private Name name;
	private ArrayList<Address> address = new ArrayList<Address>() ;
	private String gender;
	private Date DOB;
	/**
	 * This constructor uses a PersonBuilder and then just sets from the builder
	 * @param builder 
	 */
	public Person(PersonBuilder builder)
	{
		this.phoneNumber = builder.phoneNumber;
		this.name = builder.name;
		this.address = builder.address;
		this.gender = builder.gender;
		this.DOB = builder.DOB;
	}
	/**
	 * This constructor uses a person and it loops through each arraylist to get all the values and then gets 
	 * the rest of the values from per so it copies it over.
	 * @param per
	 */
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
	
	
	/**
	 * Returns the gender of the person
	 * @return String
	 */
	public String getGender(){
		return this.gender;
	}//end getGender method
	
	/**
	 * Returns a Phonenumber reference or null if i isn't in the bounds.
	 * @param i index
	 * @return PhoneNumber
	 */
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
	
	/**
	 * Returns the name 
	 * @return Name
	 */
	public Name getName(){
		return name;
	}//end getName method
	

	/**
	 * Returns the found age from Current year - DOB year
	 * @return Age in int
	 */
	public int getAge(){
		return LocalDate.now().getYear() -DOB.getYear();
	}//end getAge method
	
	/**
	 * Returns the Date of birth of this person
	 * @return Date
	 */
	public Date getDOB(){
		return DOB;
	}//end getDOB method
	
	/**
	 * Returns the salutations of the person example DR mr mrs
	 * @return String
	 */
	public String getSalutation(){
		return name.getSalutation();
	}//end getSalutation method
	
	/**
	 * Returns one of the address if 1 is out of bounds return null
	 * @param i index
	 * @return Address
	 */
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
	
	//Basic setters.
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
