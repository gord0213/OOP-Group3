import java.util.ArrayList;

public class Musician{
	
	private Person person; 
	private ArrayList<Instrument> instrument;
	private String stageName; 
	   
	public Musician(Person per, Instrument inst, String StageName){ 
		this.instrument.add(inst);
	    this.person = per;
	    this.stageName = StageName;
	}//end Musician constructor 
	   
	public Instrument getInstrument(int i){ 
		if(i < instrument.size())
			return instrument.get(i);
		else
			return null;
	} //end getInstrument method
	   
	public String getStageName(){ 
		return stageName; 
	} //end getStageName method
	
}//end Musician class
