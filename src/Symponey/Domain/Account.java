package Symponey.Domain;
import java.util.ArrayList;

import sun.security.krb5.internal.Ticket;

public class Account {

	private final Name name;
	private final String email;
	private double balance = 0.0;
	private PhoneNumber phoneNumber;
	private ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	private ArrayList<CreditCard> creditCard = new ArrayList<CreditCard>();
	
	public Account(Name name, String email,PhoneNumber phoneNumber)
	{
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public Name getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public double getBalance()
	{
		return balance;
	}
	public Ticket getTicket(int i)
	{
		if(i<ticket.size())
		{
		return ticket.get(i);
		}
		else
		{
			return null;
		}
		
	}
	/**
	 * if you want to subtract amount from the balance then input a negative number. 
	 * Balance can be negative showing that the account owes money.
	 * @param balance
	 */
	public void updateBalance(double balance)
	{
		this.balance = this.balance + balance;
	}
	
	public void addTicket(Ticket t)
	{
		ticket.add(t);
	}
	
	public void addCreditCard(CreditCard cc)
	{
		creditCard.add(cc);
	}
	
	public CreditCard getCreditCard(int i)
	{
		if(i<creditCard.size())
		{
		return creditCard.get(i);
		}
		else
		{
			return null;
		}
	}
	
	public void removeCreditCard(int i)
	{
		try{
		creditCard.remove(i);
		}
		catch(Exception e)
		{
			System.out.println("There is no CreditCards in this account owned by " name.getName());
		}
	}
	
}
