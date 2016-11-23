package Symponey.Domain;
import java.util.ArrayList;

import sun.security.krb5.internal.Ticket;

public class Account {

	private final Name name;
	private final String email;
	private double balance = 0.0;
	private PhoneNumber phoneNumber;
	private ArrayList<Ticket> ticket;
	private ArrayList<CreditCard> creditCard;
	
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
		try{
		return ticket.get(i);
		}
		catch(Exception e)
		{
			System.out.println("There is no tickets in this account owned by " +name.getName());
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
		try{
		return creditCard.get(i);
		}
		catch(Exception e)
		{
			System.out.println("There is no CreditCards in this account owned by " +name.getName());
			
		}
	}
	
	public void removeCreditCard(int i)
	{
		try{
		creditCard.remove(i);
		}
		catch(Exception e)
		{
			System.out.println("There is no CreditCards in this account owned by " +name.getName());
		}
	}
	
}
