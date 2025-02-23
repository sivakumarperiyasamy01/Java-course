package dowhile;

import java.util.Scanner;

public class PrintCubeNumberrunner {

	public static void main(String[] args) {

		

	}

	private static int findcubenumber() {

		do {
			Scanner input = new Scanner(System.in);

			int num2 = System.out.print("enter a number:");

			int num = input.nextInt();

			System.out.println(num * num * num);

			num++;

		} while (num2> 0);

	}

}
