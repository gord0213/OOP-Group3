package Symponey.Domain;

public class CreditCard {

	private String card ;
	private String num ;
	private String cvs;
	private Name name;
	
	/**
	 * This creates the class and all of these things are required
	 * This class is setup as immutable so nothing can be set once it has been created.
	 * @param card
	 * @param cardNumber
	 * @param cvs
	 * @param name
	 */
	public CreditCard(String card, String cardNumber, String cvs,Name name)
	{
		this.card = card;
		this.num = cardNumber;
		this.cvs = cvs;
		this.name = name;
	}
	
	//Basic getters for all the attributes
	public String getCreditCardNumber()
	{
		return num;
	}
	public Name getName()
	{
		return name;
	}
	public String getCVS()
	{
		return cvs;
	}
	public String getcardType()
	{
		return card;
	}
	
	
	
}
