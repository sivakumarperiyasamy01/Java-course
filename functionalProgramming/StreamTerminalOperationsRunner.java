package com.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminalOperationsRunner {
	
	
	//find sum of number using reduce method
	
	public static int findSum(List<Integer>num) {
		
		return 	num.stream().reduce(0,(num1,num2)->num1+num2);
	
		
	}
	
	
	// find max num
	
	public static int findmaxNumber(List<Integer>num) {
		
		return num.stream().max((num1,num2)->Integer.compare(num1, num2)).get();
	}
	
	/*.max(...)
	This is a terminal operation that returns the maximum element based on a comparator
	You pass a custom comparator:This uses Java’s built-in Integer.compare() method:
	
	
	🔸 .get()
	 The max() method returns an Optional<Integer> (in case the stream is empty)
	.get() extracts the value from the Optional
⚠   Throws an exception if the stream is empty — better to use .ifPresent() or .orElse() in real code
	
	
	What is Optional<Integer>?
     Optional<Integer> is a container object that may or may not contain an Integer value.
    It’s part of Java’s way to avoid null and NullPointerException, especially in return values.
	
	- it has lots of inbuilt methods
	
	*/
	
	
	// find min number
	public static int findminNumber(List<Integer>num) {
		
		return num.stream().min((num1,num2)->Integer.compare(num1, num2)).get();
	}
	
	
	// printlistofOddNumbers()- return a odd numbers as a list
	
	public static List printlistofOddNumbers(List<Integer>numbers) {
		
	return 	numbers.stream().filter((e)->e%2!=0).collect(Collectors.toList());
		
	}
	
	
	// printlistofevenNumbers()- return a even numbers as a list
	public static List printlistofEvenNumbers(List<Integer>num) {
		
		return num.stream().filter((e)->e%2==0).collect(Collectors.toList());
	}
	
	// to get square of list from first 10 numbers as list 
	
	public static List<Integer> printlistofsquareNumbers() {
		
		return IntStream.range(0, 11).map((e)->e*e).boxed().collect(Collectors.toList());
	}
	
	// boxed will convert returning integer from map method to stream.
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer>numbers=List.of(10,25,13, 60,78,96);
		
		//find sum of number using reduce method
		System.out.println(findSum(numbers));//find sum of number using reduce method

		
		// find max num
		System.out.println(findmaxNumber(numbers));
		
	
		// find min number
		System.out.println(findminNumber(numbers));
		
		
		// to get the list of odd numbers from list
		
		System.out.println(	printlistofOddNumbers(numbers));
		
		// to get the list of even numbers from list
		
		System.out.println(	printlistofEvenNumbers(numbers));
		
		// to get square of list from first 10 numbers as list 
		System.out.println(	printlistofsquareNumbers());
		


	}

}
