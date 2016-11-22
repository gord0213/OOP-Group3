package Symponey.Domain;

public class Instrument {

	private String name;
	private boolean owned;
	
	public Instrument(String name, boolean owned){
		this.name = name;
		this.owned = owned;
	}
	public String getInstrument(){
		return name;
	}
	public boolean getInstrumentOwned(){
		return owned;
	}
}
