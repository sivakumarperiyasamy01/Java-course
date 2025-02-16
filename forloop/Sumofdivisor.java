package forloop;

public class Sumofdivisor {

	private int num1;

	Sumofdivisor(int num) {
		this.num1 = num;

	}

	int sumofidivisor() {
		
		if(num1<=0) {
			return 0;
			
		}

		int sum = 0;

		// except 1 and 6 
		for (int i = 2; i <=num1-1; i++) {
			sum += num1 % i == 0 ? i : 0;

		}

		return sum;
	}

}
