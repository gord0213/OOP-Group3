package Symponey.Domain;

public class Name {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutations;
	
	public Name(String fName, String lName, String mName, String salut){
		this.firstName = fName;
	    this.lastName = lName;
	    this.middleName = mName;
	    this.salutations = salut;
	}//end Name constructor
	
	
	// basic setters and getters for class.
	public String getName(){
		return salutations +". "+ firstName +" "+ middleName +" "+ lastName;
	}//end getName method
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName method
	
	public String getLastName(){
		return lastName;
	}//end getLastName method
	
	public String getMiddleName(){
		return middleName;
	}//end getMiddleName method
	
	public String getSalutation(){
		return salutations;
	}//end getSalutation method
	
	public void setName(String name){
		name = getName();
	}//end setName method
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}//end setFirstName method
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}//end setLastName method
	
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}//end setMiddleName method
	
	public void setSalutation(String salutations){
		this.salutations = salutations;
	}//end setSalutation method
	
}//end Name class