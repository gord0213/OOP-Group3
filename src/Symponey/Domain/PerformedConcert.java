package Symponey.Domain;

import java.util.Date;

/**
 *	PerformedConcert class from the group project.
 *	extends ScheduledConcert 
 * @author Roseanne Page
 * @version 1.0.0
 */
public class PerformedConcert extends ScheduledConcert{

	private Date performedDate;
	private Long performedTime;
	
	public PerformedConcert(ScheduledConcert scheduledCon, Date perDate, Long perTime) {
		
		super(scheduledCon.getConcert(),scheduledCon.getDate(),scheduledCon.getTime(),scheduledCon.getVenue());
		performedDate = perDate;
		performedTime = perTime;
	}//end of constructor
	
	public Date getPerformedDate(){
		
		return performedDate;
	}//end of get performed date
	
	public Long getPerformedTime(){
		
		return performedTime;
	}//end of get performed date

}//end of class
