package Symponey.Domain;
/**
 * 
 * @author Michael Gordanier
 *
 */
public class Conductor extends Musician {
	/**
	 * 
	 * @param per the person the conductor represents
	 * @param stageName the conductors stage name
	 */
	public Conductor(Person per, String stageName){
		super(per, stageName);
	}
	
}
