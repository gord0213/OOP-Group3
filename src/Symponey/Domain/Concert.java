package Symponey.Domain;

import java.util.ArrayList;

public class Concert extends ID{

	private String name;
	private ArrayList<Composition> composition;
	private ArrayList<Musician> symphony;
	private Venue venue;
	
	public Concert(String name, Composition comp){
		
		super();
		this.name = name;
		composition = new ArrayList<Composition>();
		composition.add(comp);
		symphony = new ArrayList<Musician>();
		venue = null;
	}//end of constructor
	
	public Venue getVenue(){
		
		return venue;
	}//end of get venue
	
	public String getName(){
		
		return name;
	}//end of get name
	
	public Composition getComposition(int i){
		
		return composition.get(i);
	}//end of get composition
	
	public Musician getMusician(int i){
		
		return symphony.get(i);
	}//end of get musician
	
	public void setVenue(Venue venue){
		
		this.venue = venue;
	}//end of set venue
	
	public void addComposition(Composition comp){
		
		composition.add(comp);
	}//end of add composition
	
	public void addMusician(Musician mus){
		
		symphony.add(mus);
	}//end of add musician
	
	public void removeComposition(Composition comp){
		
		composition.remove(comp);
	}//end of remove composition
	
	public void removeMusician(Musician mus){
		
		symphony.remove(mus);
	}//end of remove musician
	
	
}//end of class
