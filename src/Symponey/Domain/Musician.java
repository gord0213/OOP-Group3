package Symponey.Domain;

import java.util.ArrayList;

public class Musician extends Person{
	
	private ArrayList<Instrument> instrument = new ArrayList<Instrument>();
	private String stageName; 
	   /**
	    * This Musician Class passes in a person object to the supper class and then sets the instramaent and stagename of the musicina
	    * @param per
	    * @param inst
	    * @param StageName
	    */
	public Musician(Person per, Instrument inst, String StageName){ 		
		super(per);
		this.instrument.add(inst);
	    this.stageName = StageName;
	}//end Musician constructor 
	   
	/**
	 * Returns the Instrument if there is one at location if not then return null
	 * @param i index
	 * @return Instrument
	 */
	public Instrument getInstrument(int i){ 
		if(i < instrument.size())
			return instrument.get(i);
		else
			return null;
	} //end getInstrument method
	   
	
	/**
	 * Returns the stagename of the musician
	 * @return String
	 */
	public String getStageName(){ 
		return stageName; 
	} //end getStageName method
	
}//end Musician class

