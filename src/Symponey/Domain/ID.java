package Symponey.Domain;

public class ID {

	private String id ;
	private static GetID getID;
	ID()
	{
		id = getID.getIDString();
	}
	
	public String getID()
	{
		return id;
	}
}
