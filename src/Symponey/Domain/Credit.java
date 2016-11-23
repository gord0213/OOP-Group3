package Symponey.Domain;

public class Credit extends Transaction{

	public Credit(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

	}
}