package Symponey.Domain;
import java.util.Date;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class RefundTicket extends Ticket{
	/**Initialized the ticket being refunded
	 * 
	 * @param id the Tickets ID
	 * @param seat the seat that the ticket represents
	 * @param date the date the ticket was refunded
	 */
	public RefundTicket( Seat seat, Date date){
		super(seat, date);
	}
}
