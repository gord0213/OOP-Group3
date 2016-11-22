import java.util.ArrayList;
import java.security.SecureRandom;
import java.math.BigInteger;

public class GetID {

	private ArrayList<String> id = new ArrayList<String>();
	private static GetID getID ;
	private SecureRandom random = new SecureRandom();

	private GetID()
	{}
	public static GetID getInstance()
	{
		return getID;
	}
	protected String getIDString()
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
