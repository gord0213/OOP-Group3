package Symponey.Domain;

import java.sql.Time;
import java.util.Date;

public class Test {

	
	public static void main(String[] args)
	{
		
		GetID temp = new GetID();
		temp.getIDString();
		System.out.println(temp.getIDString());
		
		Movement mov = new Movement("Test");
		System.out.println(mov.toString());
		System.out.println(mov);
		Date date = new Date();
		System.out.println(date);
		int i=0;
		while(i<1000)
		{
			// do nothing waste time
			i++;
		}
		Date date2 = new Date();
		//System.out.println(date2.getTime() - date2.getTime());
	}
}
