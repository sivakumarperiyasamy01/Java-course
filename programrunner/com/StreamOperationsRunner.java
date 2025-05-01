package programrunner.com;

import java.io.BufferedInputStream;
import java.util.List;

import java.util.stream.IntStream;

public class StreamOperationsRunner {

	public static void main(String[] args) {

		List<Integer> listofNumb = List.of(25, 5, 5, 78, 10, 500);

		// sorted method
		listofNumb.stream().sorted().forEach(e -> System.out.println(e));

		// distinct - to remove duplicate

		listofNumb.stream().distinct().forEach(e -> System.out.println(e));

		// use distinct and map the square element

		listofNumb.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));

		// print lower case

		List<String> items = List.of("APPLE", "BANANA", "MANGO");

		items.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		// find length of each element

		items.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

		// print first 10 numbers squares

		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		// Integer max comparator
		int sum = listofNumb.stream().max((num1, num2) -> Integer.compare(num1, num2)).get();

		System.out.println(sum);

		// integer minimum comparator

		int minnum = listofNumb.stream().min((num1, num2) -> Integer.compare(num1, num2)).get();

		System.out.println(minnum);
		
		
		

	}

}
