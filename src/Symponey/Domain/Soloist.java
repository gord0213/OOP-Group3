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
	public  Soloist(Person per,Instrument instra, String stageName){
		super(per,instra, stageName);
		instrumentExpertise = instra.getInstrument();
	}
	/**
	 * 
	 * @return the Instrument Expertise for the soloist
	 */
	public String getExpertise(){
		return instrumentExpertise;
	}

}
