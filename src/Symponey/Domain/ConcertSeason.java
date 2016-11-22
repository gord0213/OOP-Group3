package Symponey.Domain;
import java.util.ArrayList;
import java.util.Date;


public class ConcertSeason {

	
	private ArrayList<Concert> season ;
	private Date startDate;
	private 
	public ConcertSeason(Date startDate)
	{
		this.startDate = startDate;
	}
	public ScheduledConcert getScheduledConcert(int i)
	{
		if(i < season.size())
		{
			return (ScheduledConcert)season.get(i);
		}
		else
		{
			return null;
		}
	}
	public Date getStartDate()
	{
		return startDate;
	}
	
	public int getLengthOfSeason()
	{
		Date store ;
		int i =0;
		while(i<season.size())
		{
			if(season.get(i).getClass.equals(ScheduledConcert))
			{
				if(store.before(season.get(i)))
				{
					store = season.get(i);
				}
				
			}
			i++;
		}
		
		return startDate.compareTo(store);
	}
	public void addScheduledConcert(ScheduledConcert con)
	{
		season.add(con);
	}
	public void removeScheduledConcert(ID id)
	{
		int i =0;
		while(i<season.size())
		{
			if(season.get(i).getID.equals(id))
			{
				season.remove(i);
			}
			i++;
		}
		
	}
	public void performConcert(ID id)
	{
		int i =0;
		while(i<season.size())
		{
			if(season.get(i).getID.equals(id))
			{
				+ScheduledConcert(date:Date,time:Time, Venue ven)
			
			
			//Has to wait to build this until it is completed.
				PerformedConcert temp = new PerformedConcert()
			}
			i++;
		}
	}
	
	public PerformedConcert getPerformedConcert(int i)
	{
		if(i < season.size())
		{
			return (PerformedConcert)season.get(i);
		}
		else
		{
			return null;
		}
	}
	
	
}// End of Class
