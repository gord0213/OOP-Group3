package Symponey.Domain;

public class Address {
	
	private String streetName;
	private String aprtNum;
	private String postalCode;
	private String country;
	private String province;
	private String poBox;
	private String rr;
	private String name;
	
	/**
	 * To build an Address all of this is required
	 * in a different situation we would use a builder here and only require the main attributes.
	 * 
	 * @param streetName
	 * @param aprtNum
	 * @param postalCode
	 * @param country
	 * @param province
	 * @param poBox
	 * @param rr
	 * @param name
	 */
	public Address(String streetName, String aprtNum, String postalCode, String country, String province, String poBox, String rr, String name){
		this.streetName = streetName;
		this.aprtNum = aprtNum;
		this.postalCode = postalCode;
		this.country = country;
		this.province = province;
		this.poBox = poBox;
		this.rr = rr;
		this.name = name;
	}//end Address constructor
	
	
	// Straight forward getters and setters for this class.
	
	public String getStreetName(){
		return streetName;
	}//end getStreetName method
	public String getRR()
	{
		return rr;
	}
	
	public String getAprtNumber(){
		return aprtNum;
	}//end getAprtNumber method
	
	public String getPostalCode(){
		return postalCode;
	}//end getPostalCode method
	
	public String getCountry(){
		return country;
	}//end getCountry method
	
	public String getProvince(){
		return province;
	}//end getProvince method
	
	public String getPOBox(){
		return poBox;
	}//end getPOBox method
	
	public String getName(){
		return name;
	}//end getName method
	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}//end setStreetName method
	
	public void setAprtNumber(String aprtNum){
		this.aprtNum = aprtNum;
	}//end setAprtNumber method
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}//end setPostalCode method
	
	public void setCountry(String coutry){
		this.country = coutry;
	}//end setCountry method
	
	public void setProvince(String province){
		this.province = province;
	}//end setProvince method
	
	public void setPOBox(String poBox){
		this.poBox = poBox;
	}//end setPOBox method
	
	public void setName(String name){
		this.name = name;
	}//end setName method
	public void setRR(String rr)
	{
		this.rr = rr;
	}
	
}//end Address class
