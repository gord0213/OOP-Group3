package Symponey.Domain;


import java.sql.Time;
import java.util.Date;


public class ScheduledConcert extends Concert{
	
	private Date date;
	private Time timeOfConcert;
	private Venue venue;

	public ScheduledConcert(Concert con, Date date, Time time, Venue ven){
		
		super(con.getName(),con.getComposition(0));
		this.date = date;
		timeOfConcert = time;
		venue = ven;
	}//end of constructor
	
		
	public Date getDate(){
		
		return date;
	}//end of get date
	
	public Time getTime(){
		
		return timeOfConcert;
	}//end of get time
	
	public Venue getVenue(){
		
		return venue;
	}//end of get venue
	
	public void setDate(Date date){
		
		this.date = date;
	}//end of set date
	
	public void setTime(Time time){
		
		timeOfConcert = time;
	}//end of set time
	
	public void setVenue(Venue venue){
		
		this.venue = venue;
	}//end of set venue

	public Concert getConcert() {
		
		return super.getConcert();
	}//end of get concert


	
}//end of class
