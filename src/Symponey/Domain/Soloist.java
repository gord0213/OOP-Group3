package Symponey.Domain;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class Soloist extends Musician{

	private String instrumentExpertise;
	/**
	 * 
	 * @param per a instance of the person
	 * @param stageName The name the person uses on stage
	 */
	public  Soloist(Person per, Instrument instrument, String stageName){
		super(per, instrument, stageName);
	}
	/**
	 * 
	 * @return the Instrument Expertise for the soloist
	 */
	public String getExpertise(){
		return instrumentExpertise;
	}
	/**Takes in a vairable and sets the soloist expertise to the passed thouhg variable
	 * 
	 * @param expertise the instrument that th soloist is a expertise at
	 */
	public void setExpertise(String expertise){
		this.instrumentExpertise = expertise;
	}
	
}
