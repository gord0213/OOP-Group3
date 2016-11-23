package Symponey.Domain;

import java.util.ArrayList;

/**
 *	Venue class from the group project.
 *	extends ID 
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Venue extends ID{

	private String name;
	private Address address;
	private ArrayList<Seat> seat;
	private ArrayList<Instrument> instrument;
	
	public Venue(Address add, String name, Seat seat){
		
		super();
		this.address = add;
		this.name = name;
		this.seat = new ArrayList<Seat>();
		this.seat.add(seat);
		instrument = new ArrayList<Instrument>();
	}//end of constructor
	
	public Address getAddress(){
		
		return address;
	}//end of get address
	
	public String getName(){
		
		return name;
	}//end of get name
	
	public Seat getSeat(int i){
		
		return seat.get(i);
	}//end of get seat
	
	public Instrument getInstrument(int i){
		
		return instrument.get(i);
	}//end of get instrument
	
	public void setName(String name){
		
		this.name = name;
	}//end of set name
	
	public void addSeat(Seat seat){
		
		this.seat.add(seat);
	}//end of add seat
	
	public void addInstrument(Instrument instrument){
		
		this.instrument.add(instrument);
	}//end of add instrument
	
public void removeSeat(Seat seat){
		
		this.seat.remove(seat);
	}//end of remove seat
	
	public void removeInstrument(Instrument instrument){
		
		this.instrument.remove(instrument);
	}//end of remove instrument
	
	public Boolean checkInstrument(Instrument i){
		
		return instrument.contains(i);
	}//end of check instrument
	
	public Boolean venueSoldOut(){
		Boolean result = true;
		
		for(int i = 0; i<seat.size(); i++){
			
			if(seat.get(i) instanceof BalconySeat || seat.get(i) instanceof BoothSeat || seat.get(i) instanceof OrchestraSeat){
				if(seat.get(i).isTaken() == false){
					result = false;
				}//end of if seat is taken
			}//end of if seat is a balcony, booth or orchestra seat
			
		}//end of for loop
		
		
		return result;
	}//end of venue is sold out
	
}//end of class
