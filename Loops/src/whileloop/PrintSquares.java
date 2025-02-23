package whileloop;

public class PrintSquares {

	private int PlayerCount;

	public PrintSquares(int num) {

		this.PlayerCount = num;
	}

	void Printsquarenum() {
		
		if(PlayerCount<0) {
			System.out.println("not an number");
		}
		int count = 1;

		double num1 = Math.sqrt(PlayerCount);
		

		while (count < num1) {

			System.out.println(count * count);
			count++;
		}

	}

}
