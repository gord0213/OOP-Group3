package Symponey.Domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Transaction {

	private final String ledgerAccount;
	private final String time;
	private final Name name;
	private final double price;
	private final Ticket ticket;

	/**
	 * This class is immutable so only getters are created. This is because once a transaction is complete you should not be able to change it.
	 * @param ledger
	 * @param name
	 * @param price
	 * @param ticket
	 */
	public	Transaction(String ledger, Name name, double price, Ticket ticket){
		this.ledgerAccount=ledger;
		this.name=name;
		this.price=price;
		this.ticket=ticket;
		time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}

	public String getLedgerAccount(){
		return ledgerAccount;
	}
	public String getTime(){
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

