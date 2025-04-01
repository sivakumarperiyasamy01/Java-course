package objectcomposition;

public class Bookreview {
	
	// state 
	private int id;
	private String Description;
	private double Rating;
	
	// constructor 
	
	public Bookreview(int id,String des,double rating) {
		this.id=id;
		this.Description=des;
		this.Rating=rating;
		
	}
	
	
	
	
	// print the state 
	
	public String toString() {
		return String.format("id-%d,Description-%s,Rating-%f",id,Description,Rating);
	}
	
	
	

}
