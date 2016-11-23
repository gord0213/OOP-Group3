package Symponey.Domain;

public class Seat{
	
	private double price;
	private String seatNumber; 
	private boolean isTaken;
	/**
	 * Constructor for the seat class
	 * @param price
	 * @param seatNumber
	 */
	public Seat(double price,String seatNumber){
		this.price = price;
		this.seatNumber = seatNumber;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getseatNumber(){
		return seatNumber;
	}
	/**
	 * This method sets the seat to taken
	 */
	public void Taken()
	{
		isTaken = true;
	}
	/**
	 * This returns if the seat is taken or not.
	 * @return Boolean
	 */
	public boolean isTaken(){
		return isTaken;
	}
	
}
