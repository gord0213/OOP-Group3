package Symponey.Domain;

import java.sql.Time;
import java.util.Date;

/**
 *	PerformedConcert class from the group project.
 *	extends ScheduledConcert 
 * @author Roseanne Page
 * @version 1.0.0
 */
public class PerformedConcert extends ScheduledConcert{

	private Date performedDate;
	
	public PerformedConcert(ScheduledConcert scheduledCon, Date perDate) {
		
		super(scheduledCon.getConcert(),scheduledCon.getDate(),scheduledCon.getTime(),scheduledCon.getVenue());
		performedDate = perDate;
	}//end of constructor
	
	public Date getPerformedDate(){
		
		return performedDate;
	}//end of get performed date
	


}//end of class
