package Symponey.Domain;

public class CreditToAccount extends Transaction{

	public CreditToAccount(String ledger, Name name, double price, Ticket ticket){
		super(ledger, name, price,ticket);

	}
}