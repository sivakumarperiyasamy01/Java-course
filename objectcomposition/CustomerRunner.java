package objectcomposition;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeaddress=new Address("illiam","kangayam",638701);
		
		Customer customer= new Customer("siva",homeaddress);
		
		System.out.println(customer);
	}

}
