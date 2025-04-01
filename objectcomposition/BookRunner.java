package objectcomposition;

public class BookRunner {

	public static void main(String[] args) {
		
		
		Book book=new Book(100,"javaprogramming","sivakumar");
		book.addReview(new Bookreview(10,"newone",5));
		book.addReview(new Bookreview(12,"harrypater",10));
		System.out.println(book);
	}

}
