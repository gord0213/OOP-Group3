package Symponey.Domain;
import java.util.Date;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class BoughtTicket extends Ticket{
	/**Initialized the ticket being bought
	 * 
	 * @param id the Tickets ID
	 * @param seat the seat that the ticket represents
	 * @param date the date the ticket was bought
	 */
	public BoughtTicket(String id, Seat seat, Date date){
		super(id, seat, date);
	}
}
