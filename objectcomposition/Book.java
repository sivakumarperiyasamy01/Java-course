package objectcomposition;

import java.util.ArrayList;

public class Book {

	// state
	private int id;
	private String bookname;
	private String author;
	private ArrayList<Bookreview>review= new ArrayList<>();
	
	
	// constructor 
	
	public Book(int id, String name ,String author) {
		this.id=id;
		this.bookname=name;
		this.author=author;
		
	}

	
	// operations 

	public void addReview(Bookreview review) {
		this.review.add(review);
		
	}

	
	
	public String toString() {
		
		return  String.format("addreview-[%s]",review);
	
	}	
	
	

	
	

}
