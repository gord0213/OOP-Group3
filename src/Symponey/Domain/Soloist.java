package Symponey.Domain;

public class Soloist extends Musician{

	private String instrumentExpertise;
	
	public  Soloist(Person per, String stageName){
		super(per, stageName);
	}
	public String getExpertise(){
		return instrumentExpertise;
	}
	public void setExpertise(String expertise){
		this.instrumentExpertise = expertise;
	}
	
}
