package Symponey.Domain;

public class Credit extends Transaction{

	
	/**
	 * This is just for a buiness process
	 * @param ledger
	 * @param name
	 * @param price
	 * @param ticket
	 */
	public Credit(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

	}
}