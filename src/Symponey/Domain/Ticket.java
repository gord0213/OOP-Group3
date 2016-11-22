package Symponey.Domain;
import java.util.Date;

public class Ticket extends ID{

	private Seat seat;
	private Date dateOfTicket;
	
	public Ticket(String id, Seat seat, Date date){
		this.seat = seat;
		this.dateOfTicket = date;
	}
	public String getID(){
		return super.getID();
	}
	
	public Date getDate(){
		return dateOfTicket;
	}
	
	public Seat getSeat(){
		return seat;
	}
}
