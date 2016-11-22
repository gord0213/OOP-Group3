package Symponey.Domain;

public class BoothSeat extends Seat{

	private String memberName;
	
	public BoothSeat(double price, String seatNumber,String memberName) {
		super(price, seatNumber);
		this.memberName = memberName;
	}
	
}
