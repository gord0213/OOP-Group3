package Symponey.Domain;

public class Movement extends ID{

	private String name;
	
	public Movement (String name){
		
		super();
		this.name = name;		
	}//end of constructor
	
	public String getName(){
		
		return name;
	}//end of get name
	
	public void setName(String name){
		
		this.name = name;
	}//end of set name
	
}//end of class
