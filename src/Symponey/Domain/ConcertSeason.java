package Symponey.Domain;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class ConcertSeason {

	
	private ArrayList<Concert> season = new ArrayList<Concert>() ;
	private Date startDate;
	 
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
		Date store = new Date(); ;
		int i =0;
		while(i<season.size())
		{
			if(season.get(i).getClass().equals("ScheduledConcert"))
			{
				if(store.before(((ScheduledConcert) season.get(i)).getDate()))
				{
					store = ((ScheduledConcert) season.get(i)).getDate();
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
			if(season.get(i).getID().equals(id))
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
			if(season.get(i).getID().equals(id))
			{			
				PerformedConcert temp = new PerformedConcert((ScheduledConcert)season.get(i), new Date() );
				season.set(i, temp);
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
