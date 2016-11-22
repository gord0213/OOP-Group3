package Symponey.Domain;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class Instrument {

	private String name;
	private boolean owned;
	/**
	 * 
	 * @param name The name of the instrument
	 * @param owned Is this instrument owned
	 */
	public Instrument(String name, boolean owned){
		this.name = name;
		this.owned = owned;
	}
	/**
	 * 
	 * @return the Instrument name
	 */
	public String getInstrument(){
		return name;
	}
	
	/**
	 * 
	 * @return is the instrument owned
	 */
	public boolean getInstrumentOwned(){
		return owned;
	}
}
