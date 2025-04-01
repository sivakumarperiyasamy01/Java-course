package objectcomposition;

public class Customer {

	// state

	private String name;
	private Address homeaddress;



	// constructor

	public Customer(String name, Address homeaddress) {

		this.name = name;
		this.homeaddress = homeaddress;

	}

	// operations

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String toString() {
		return String.format("name-%s,homeaddress-%s,getHomeaddres-%s",name,homeaddress,getHomeaddress());
	
	
	}
	
	
}