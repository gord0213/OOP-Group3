package Symponey.Domain;

import java.util.ArrayList;

public class Concert extends ID{

	private String name;
	private ArrayList<Composition> composition;
	private ArrayList<Musician> symphony;
	
	
	public Concert(String name, Composition comp){
		
		super();
		this.name = name;
		composition = new ArrayList<Composition>();
		composition.add(comp);
		symphony = new ArrayList<Musician>();
		
	}//end of constructor
	
		
	public String getName(){
		
		return name;
	}//end of get name
	
	public Composition getComposition(int i){
		
		return composition.get(i);
	}//end of get composition
	
	public Musician getMusician(int i){
		
		return symphony.get(i);
	}//end of get musician
	
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
	
	public Boolean isSame(Concert con){
		
		return this == con;
	}//end of is same
	
	public Concert getConcert() {
		
		return this;
	}//end of get concert
	
	
}//end of class
