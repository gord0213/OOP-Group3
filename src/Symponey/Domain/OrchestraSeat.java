package Symponey.Domain;

public class OrchestraSeat extends Seat{

	private String memberName;
	/**
	 * Same as Seat this class is just for buisness processes.
	 * @param price
	 * @param seatNumber
	 * @param memberName
	 */	
	public OrchestraSeat(double price, String seatNumber,String memberName) {
		super(price, seatNumber);
		this.memberName = memberName;
	}
	
}
