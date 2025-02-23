package forloop;

public class Printtriangle {

	private int number1;

	Printtriangle(int num) {

		this.number1 = num;

	}

	void Printnum() {
		//print triangle
		
		for(int i=1; i<=number1;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		 
	

	}

}
