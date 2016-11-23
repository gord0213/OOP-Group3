package Symponey.Domain;

public class Payment extends Transaction{

	public Payment(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

	}
}