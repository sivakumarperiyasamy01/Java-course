package interfaces;

public class FlyRunner {

	public static void main(String[] args) {
		
		Fly[]run= {new Bird(),new Aeroplane()};
		
		for(Fly run1:run) {
			run1.fly();
				
		}
		

	}

}
