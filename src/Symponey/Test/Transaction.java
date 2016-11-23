package Symponey.Test;

public class Transaction {

	private final String ledgerAccount;
	private final TimeStamp time;
	private final Name name;
	private final double price;
	private final Ticket ticket;

	public	Transaction(String ledger, Name name, double price, Ticket ticket){
		this.ledgerAccount=ledger;
		this.name=name;
		this.price=price;
		this.ticket=ticket;
	}

	public String getLedgerAccount(){
		return ledgerAccount;
	}
	public TimeStamp getTime(){
		return time;
	}
	public Name getName(){
		return name;
	}
	public Ticket getTicket(int i){
		return ticket;
	}
	public double getPrice(){
		return price;
	}
	private void writeHistory(){

	}
}

