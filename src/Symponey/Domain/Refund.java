package Symponey.Domain;

public class Refund extends Transaction{
	

	public Refund(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

}
}