
public class CreditCard {

	private String card ;
	private String num ;
	private String cvs;
	private Name name;
	
	public CreditCard(String card, String cardNumber, String cvs,Name name)
	{
		this.card = card;
		this.num = cardNumber;
		this.cvs = cvs;
		this.name = name;
	}
	
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
