package Symponey.Domain;

public class BalconySeat extends Seat{

	/**
	 * Same as Seat this class is just for buisness processes.
	 * @param price
	 * @param seatNumber
	 * @param memberName
	 */
	public BalconySeat(double price, String seatNumber,String memberName) {
		super(price, seatNumber);
	}
	
}
