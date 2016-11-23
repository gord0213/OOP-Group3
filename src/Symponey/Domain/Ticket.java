package Symponey.Domain;
import java.util.Date;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class Ticket extends ID{

	private Seat seat;
	private Date dateOfTicket;
	/**
	 * 
	 * @param id The Ticket ID
	 * @param seat Instance of seat
	 * @param date The date the ticket is sold
	 */
	public Ticket(Seat seat, Date date){
		super();
		this.seat = seat;
		this.dateOfTicket = date;
	}
	
	/**
	 * @return the id variable from the super class
	 */
	public String getID(){
		return super.getID();
	}
	/**
	 * 
	 * @return the Date the ticket is bought
	 */
	public Date getDate(){
		return dateOfTicket;
	}
	/**
	 * 
	 * @return the instance of seat variable
	 */
	public Seat getSeat(){
		return seat;
	}
}
