package Symponey.Domain;

public class BoothSeat extends Seat{

	/**
	 * Same as Seat this class is just for buisness processes.
	 * @param price
	 * @param seatNumber
	 * @param memberName
	 */
	public BoothSeat(double price, String seatNumber,String memberName) {
		super(price, seatNumber);
	}
	
}
