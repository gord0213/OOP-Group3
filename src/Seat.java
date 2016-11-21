
public class Seat{
	
	private double price;
	private String seatNumber; 
	private boolean isTaken;
	
	public Seat(double price,String seatNumber){
		this.price = price;
		this.seatNumber = seatNumber;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getseatNumber(){
		return seatNumber;
	}
	
	public boolean isTaken(){
		if(isTaken == true){
			return true;
		}
		return false;
	}
	
}
