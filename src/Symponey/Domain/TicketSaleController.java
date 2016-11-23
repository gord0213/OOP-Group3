package Symponey.Domain;

import java.util.ArrayList;

public class TicketSaleController {

	private ArrayList<Account> account = new ArrayList<Account>();
	private ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	private ArrayList<ConcertSeason> con = new ArrayList<ConcertSeason>() ;
	
	public TicketSaleController(ConcertSeason con )
	{
		this.con = con;
	}
	
	/**
	 * returns account if in bounds if not null
	 * @param i index
	 * @return Account
	 */
	public Account getAccount(int i )
	{
		if(i<account.size())
		{
			return account.get(i);
		}
		else
		{
			return null;
		}
		
	}
	
	/**
	 * The only method that has to be tested in the JUNIT testing
	 */
	public void addConcert(ScheduledConcert con)
	{
		this.con.addScheduledConcert(con);
	}
	public Concert getScheduledConcert(int i)
	{
		return con.get(con.size()-1).getScheduledConcert(i);
	}
	
	//All of these are unimplemented process not required
	public void ticketCreditToAccount()
	{
		
	}
	public ArrayList<Transaction> readHistory()
	{
		return null;
	}
	public void validateTicket(Ticket tick, Account ac)
	{
		
	}
	public void sellTicketOnline()
	{
		
	}
	public void sellTicketKiosik()
	{
		
	}
	public void refundTicketOnline()
	{
		
	}
	public void refundTicketKiosik()
	{
		
	}
	public void creditTicketToAccount()
	{
		
	}
	public ArrayList<Seat> getSeatsForConcert()
	{
		return null;
	}
	public ArrayList<Seat> getFreeSeats(String id)
	{
		return null;
	}
	public ArrayList<Seat> getTakenSeats(String id)
	{
		return null;
	}
	public Musician getMusician(String id)
	{
	return null;	
	}
	public void addAccount(Account acc)
	{
		this.account.add(acc);
	}
	public void addCompoisition(ScheduledConcert con)
	{
		
	}	
	public void addMusician(ScheduledConcert con)
	{
		
	}
	public void addSolosit(ScheduledConcert con, Composition comp)
	{
		
	}
	public void addMovement(ScheduledConcert con, Composition comp)
	{
		
	}
	public void removeSoloist(ScheduledConcert con, Composition comp)
	{
		
	}
	public void addConductor(ScheduledConcert con, Composition comp) 
	{
		
	}
	public void performConcert(ScheduledConcert con)
	{
		
	}

	

}
