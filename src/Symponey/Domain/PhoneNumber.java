package Symponey.Domain;

public class PhoneNumber { 

	private int nationCode; 
	private int regionCode; 
	private int areaCode; 
	private int lastFour; 
	private String name; 
	   
	public PhoneNumber(int nCode, int rCode, int aCode, int lFour, String name){ 
	     this.nationCode = nCode;
	     this.regionCode = rCode;
	     this.areaCode = aCode;
	     this.lastFour = lFour;
	     this.name = name;
	}//end PhoneNumber constructor 
	   
	public String getPhoneNumber(){ 
			return "+"+ nationCode +"-("+ regionCode +")"+ areaCode+ "-"+ lastFour; 
	}//end getPhoneNumber method 
	   
	public String getName(){ 
		return name; 
	}//end getName method 
	   
}//end PhoneNumber class
