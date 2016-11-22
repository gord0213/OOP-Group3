package Symponey.Domain;

public class BalconySeat extends Seat{

private String memberName;
	
	public BalconySeat(double price, String seatNumber,String memberName) {
		super(price, seatNumber);
		this.memberName = memberName;
	}
	
}
