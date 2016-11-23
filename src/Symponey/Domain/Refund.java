package Symponey.Domain;

public class Refund extends Transaction{
	
	/**
	 * This is just for a buiness process
	 * @param ledger
	 * @param name
	 * @param price
	 * @param ticket
	 */
	public Refund(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

}
}