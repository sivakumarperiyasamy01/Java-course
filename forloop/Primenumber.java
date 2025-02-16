package forloop;

public class Primenumber {
	
	private int num;
	
	public Primenumber(int number) {
		this.num=number;
	}
	

	public Boolean isprime() {
		
		// number 1 is either prime or composite
		
		if(num<2) {
			return false;
		}
		
		// divisible by 2 up to num
		
		for(int i=2; i<=num-1;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
	return true;
		
	}

}
