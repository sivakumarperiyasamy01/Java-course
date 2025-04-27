package com.fuctonalprogramming;

import java.util.List;

public class FPexcerciseRunner {

	public static void main(String[] args) {
		List<String> listofanimals = List.of("lion", "tiger", "Monkey", "cow");
		List<Integer> Listofnumbers = List.of(10, 20, 55, 60);
		Printevennumbers(Listofnumbers);
		printOddnumbers(Listofnumbers);
		printfiltereditmes(listofanimals);

	}

	// filter strings
	public static void printfiltereditmes(List<String> listitems) {
		listitems.stream().filter(e -> e.endsWith("on")).

				forEach(e -> System.out.println(e));

	}

	// print odd even numbers

	public static void Printevennumbers(List<Integer> numbers) {

		numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

	}

	// print odd numbers

	public static void printOddnumbers(List<Integer> num) {
		num.stream().filter(e -> e % 2 == 1).forEach(e -> System.out.println(e));
	}

}
