package Symponey.Domain;

public class ID {

	private String id ;
	private static GetID getID = new GetID();
	/**
	 * Basic constructor automatically sets the id
	 */
	ID()
	{
		id = getID.getIDString();
	}
	/**
	 * This returns the ID for the class
	 * @return ID
	 */
	public String getID()
	{
		return id;
	}
}
