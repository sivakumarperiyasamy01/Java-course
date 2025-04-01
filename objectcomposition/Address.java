package objectcomposition;

public class Address {
	
	private String line1;
	private String line2;
	private int Zipcode;
	
	public Address(String line1, String line2, int zipcode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		Zipcode = zipcode;
	}
	
	
	public String toString() {
		return String.format("line1-%s,line2-%s,zipcode-%d",line1,line2,Zipcode);
	
	
	}
	
	
	
	
	

}
