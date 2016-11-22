import java.util.ArrayList;
import java.security.SecureRandom;
import java.math.BigInteger;

public class GetID {

	private ArrayList<String> id;
	private SecureRandom random = new SecureRandom();

	public GetID()
	{
		id = new ArrayList<String>();
	}
	public String getIDString()
	{
		String hold = new BigInteger(130, random).toString(32);
		
		while(id.contains(hold))
		{
			hold = new BigInteger(130, random).toString(32);
		}
		id.add(hold);
		
		return hold;
	}
	
}
