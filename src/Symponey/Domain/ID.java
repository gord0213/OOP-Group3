package Symponey.Domain;

public class ID {

	private String id ;
	private static GetID getID = new GetID();
	ID()
	{
		id = getID.getIDString();
	}
	
	public String getID()
	{
		return id;
	}
}
