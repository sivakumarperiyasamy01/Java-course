package regex.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		Regex r1 = new Regex();
		// r1.mobilenumvalidation();
		// r1.usernameValidation();
		r1.userEmailvalidation();

	}

	/*
	 * get input from the user as string
	 *  use regex pattern 
	 *  compile the pattern into pattern object
	 *  then matcher will give you an object
	 *  check if the match found return true or return false
	 */

	private void userEmailvalidation() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter user name:");
		String email = scan.nextLine();

		String regex = "^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]{2,6}$";

		Matcher match = Pattern.compile(regex).matcher(email);

		if (match.matches()) {
			System.out.println("is valid email id ");
		} else {
			System.out.println("not valid email id");
		}

	}

	private void usernameValidation() {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter user name:");
		String name = scan.nextLine();

		String regex = "^[a-zA-Z0-9]{3,15}$";

		Pattern ptn = Pattern.compile(regex); // it returns the object using that we are invoking the method

		Matcher match = ptn.matcher(name); // it returns the object

		if (match.matches()) {
			System.out.println("valid user name");
		} else {
			System.out.println("not valid user name");
		}

	}

	private void mobilenumvalidation() {

		Scanner scan = new Scanner(System.in);

		// get inupt number from user as string because we cant store max in int or long
		// in practical we get as string only
		System.out.println("Enter your name:");

		String num = scan.nextLine();

		String regex = "^[6-9]\\d{9}$";

		// pattern class has own static method compile then passing regex
		Pattern ptn = Pattern.compile(regex);
		// pattern class has own static non static method
		Matcher match = ptn.matcher(num);

		if (match.matches()) {
			System.out.println("is valid mobile number");
		} else {
			System.out.println("not valid mobile num");
		}

	}

}
