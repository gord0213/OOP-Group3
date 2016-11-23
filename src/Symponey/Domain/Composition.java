package Symponey.Domain;

import java.util.ArrayList;

/**
 *	Composition class from the group project.
 *	extends ID
 * @author Roseanne Page
 * @version 1.0.0
 */
public class Composition extends ID {

	private ArrayList<Movement> move;
	private Boolean approved;
	private String composer;
	private ArrayList<Soloist> soloist ;
	private Conductor conductor;
	
	public Composition(String composer){
		
		super();
		move = new ArrayList<Movement>();
		soloist = new ArrayList<Soloist>();
		approved = false;
		this.composer = composer;
		conductor = null;
	}//end of constructor
	
	public Soloist getSolo(int i){
		
		return soloist.get(i);
	}//end of get soloist
	
	public Movement getMovement(int i){
		
		return move.get(i);
	}//end of get movement
	
	public Boolean getApproved(){
		
		return approved;
	}//end of get approved
	
	public String getComposer(){
		
		return composer;
	}//end of get composer
	
	public Conductor getConductor(){
		
		return conductor;
	}//end of get conductor
		
	public void setConductor(Conductor con){
		
		conductor = con;
	}//end of set conductor
	
	public void setApproved(Boolean approved){
		
		this.approved = approved;
	}//end of setApproved
	
	public void addSoloist(Soloist solo){
		
		soloist.add(solo);
	}//end of add soloist
	
	public void removeSoloist(Soloist solo){
		
		soloist.remove(solo);
	}
	
	public void addMovement(Movement move){
		
		this.move.add(move);
	}//end of add movement(single)
			
	public void addMovement(Movement[] move){
		
		for(int i = 0; i < move.length; i++){
			this.move.add(move[i]);
		}//end of for loop
	}//end of add movement(array)
	
	public void removeMovement(Movement move){
		
		this.move.remove(move);
	}//end of remove movement
	
}//end of class
