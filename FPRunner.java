package com.fuctonalprogramming;

import java.util.List;

public class FPRunner {

	public static void main(String[] args) {

		List<String> listitems = List.of("apple", "banana", "orange", "strawberry");
		List<Integer> listofnumbers = List.of(10, 20, 30, 45);

		// calling a method
		printitmes(listitems);
		loopitems(listitems);
		printnumbers(listofnumbers);

	}

	// create a method to loop around print the items

	public static void printitmes(List<String> listitems) {

		for (String string : listitems) {
			System.out.println(string);
		}

	}

	// print the items using Stream method
	public static void loopitems(List<String> listitem) {

		listitem.stream().forEach(e -> System.out.println(e));

	}

	// Print the numbers

	public static void printnumbers(List<Integer> listofnumbers) {

		listofnumbers.stream().forEach(e -> System.out.println(e));

	}

}
