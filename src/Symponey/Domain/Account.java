package Symponey.Domain;
import java.util.ArrayList;

import sun.security.krb5.internal.Ticket;

public class Account {

	
	
	private final Name name;
	private final String email;
	private double balance = 0.0;
	private final PhoneNumber phoneNumber;
	private ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	private ArrayList<CreditCard> creditCard = new ArrayList<CreditCard>();
	/**
	 * These params are required to create the account.
	 * only 1 phoneNumber per account
	 * 
	 * @param name
	 * @param email
	 * @param phoneNumber
	 */
	public Account(Name name, String email,PhoneNumber phoneNumber)
	{
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * Returns the Object Name 
	 * @return name
	 */
	public Name getName()
	{
		return name;
	}
	/**
	 * Returns the String Email
	 * @return Email
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * Returns the Balance of the account can be negative if so then there money owed on the account
	 * @return Balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * This method returns the Ticket at I as long as it's in bound.
	 * If it is not in bound then it reutrns null.
	 * @param i index of the ticket you are looking for
	 * @return the ticket or null if not found
	 */
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
	/**
	 * This method adds a ticket that has been bounght to the account.
	 * @param t Ticket
	 */
	public void addTicket(Ticket t)
	{
		ticket.add(t);
	}
	/**
	 * This method adds a credit card to the account. can have more than one credit card or none at all
	 * @param cc CreditCard
	 */
	
	public void addCreditCard(CreditCard cc)
	{
		creditCard.add(cc);
	}
	
	/**
	 * This method will return a creditCard as long as i is within bounds.
	 * If it is not then a null is thrown.
	 * @param i index of creditCard
	 * @return CreditCard
	 */
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
	
	
	/**
	 * Removes the creditcard at i 
	 * throws an execption if not credit card it found and displays the name of the person whose account it is associated with
	 * @param i index
	 */
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
	
	/**
	 * Returns the phonenumber to the account
	 * @return phonenumber
	 */
	public PhoneNumber getPhoneNumber()
	{
		return phoneNumber;
	}
	
}
