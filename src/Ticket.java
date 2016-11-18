import java.util.Date;

public class Ticket {

	private Seat seat;
	private Date dateOfTicket;
	
	public Ticket(String id, Seat seat, Date date){
		this.seat = seat;
		this.dateOfTicket = date;
	}
	public String getID(){
		return ID;
	}
	
	public Date getDate(){
		return dateOfTicket;
	}
	
	public Seat getSeat(){
		return seat;
	}
}
