package whileloop;

public class PrintCubenumber {
	private int number;

	public PrintCubenumber(int num1) {
		this.number=num1;
		
	}

	public void cubenumber() {
		
		int i=1;
		
		 while(i*i*i<number) {
			 System.out.println(i*i*i);
			 i++;
		 }
		
	}
	
	

}
