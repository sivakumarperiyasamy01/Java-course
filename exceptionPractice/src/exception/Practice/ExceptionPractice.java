package exception.Practice;

import java.util.*;

public class ExceptionPractice {

	public static void main(String[] args) {

		ExceptionPractice p1 = new ExceptionPractice();
	//	p1.printException();
		p1.divide();

	}

	private void printException() {

		try {

			// String myString = null;
			// System.out.println(myString.length());

			// int a = 10;
			// int b = 0;

			// int sum = a / b;

			Scanner sc = new Scanner(System.in);

			int num1 = sc.nextInt();

			int[] num = new int[num1];

			sc.close();

		} catch (NullPointerException s) {

			System.err.println(s.getMessage()); // null pointer exception handeled

		} catch (ArithmeticException s) {

			System.out.println(s.getMessage()); // arithmetic exception handeled

		} catch (Exception f) {

			System.out.println(f.getMessage()); // remaining exceptions handled by parent class except above

		}

		finally {
			System.out.println("exception handelled");
		}

	}

	private void divide() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int[] arr = new int[num1];
			System.out.println(num1 / num2);
		} catch (ArithmeticException ee) {
			System.out.println(ee.getMessage());
			ee.printStackTrace();
			System.out.println("dont divide a number by zero");
		} catch (InputMismatchException ime) {
			System.out.println(ime.getMessage());
			System.out.println("enter only number");
		} catch (NegativeArraySizeException nae) {
			System.out.println(nae.getMessage());
			System.out.println("dont give a negative number");
		} finally {
			System.out.println("welcome");
		}
	}

}
