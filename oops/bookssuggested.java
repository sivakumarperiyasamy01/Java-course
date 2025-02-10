package oops;

public class bookssuggested {

	public static void main(String[] args) {
	
		books artofcomputerprogramming=new books();
		books Effectivejava= new books();
		books Cleancode= new books();
	
		
		artofcomputerprogramming.studyplan();
		Effectivejava.studyplan();
		Cleancode.studyplan();
		 
		artofcomputerprogramming.setNoOfCopies(10);
		Effectivejava.setNoOfCopies(20);
		Cleancode.setNoOfCopies(10);
		
		
		System.out.println(artofcomputerprogramming.getNoOfCopies());
		System.out.println(Effectivejava.getNoOfCopies());
		System.out.println(Cleancode.getNoOfCopies());
		
		
	}

}
