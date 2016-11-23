package Symponey.Domain;
import java.util.ArrayList;
import java.util.Date;


public class ConcertSeason {

	
	private ArrayList<Concert> season = new ArrayList<Concert>() ;
	private Date startDate;
	/**
	 *  This constructor only requires a start date past that everything else is buils from the setters and adder methods
	 * @param startDate Start of the season
	 */
	public ConcertSeason(Date startDate)
	{
		this.startDate = startDate;
	}
	/**
	 * Returns the concert at i after it has been casted.
	 * if index is out of bounds returns null.
	 * If at the index it is not a ScheduledConcert then there will be an error
	 * @param i index
	 * @return ScheduledConcert
	 */
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
	/**
	 * Returns the start date of the season
	 * 
	 * @return startDate
	 */
	public Date getStartDate()
	{
		return startDate;
	}
	
	/**
	 * This method searchs all the scheduledConcerts and finds the one with the largest Date and then subtracts that from the start date
	 * and you get the length of the season
	 * @return length of season in days.
	 */
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
		
		return store.getDate() - startDate.getDate();
	}
	/**
	 * Adds a ScheduledConcert to the list
	 * @param con ScheduledConcert
	 */
	public void addScheduledConcert(ScheduledConcert con)
	{
		season.add(con);
	}
	/**
	 * 
	 * if the ID is not found do nothing
	 * if  found then remove 
	 * @param id of the concert
	 */
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
	/**
	 * This is a buisiness method and it changes the state of a scheudledconcert
	 * to that of a performed concert
	 * @param id ID of concert
	 */
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
	
	/**
	 * This returns the perforrmedConcert 
	 * if the index is wrong and it's not a performed concert it will still return it.
	 * @param i index
	 * @return PerformedConcert
	 */
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
