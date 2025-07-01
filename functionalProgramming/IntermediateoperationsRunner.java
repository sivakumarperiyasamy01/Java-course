package com.functionalProgramming;

import java.util.List;

public class IntermediateoperationsRunner {

	
	// sorted numbers
	
	public static void shortingNumber(List<Integer>number) {
		
		number.stream().sorted().forEach(e->System.out.println(e));
	}
	
	
	//distinct numbers
	
	public static void distinctnumber(List<Integer>num) {
		
		num.stream().distinct().forEach(e->System.out.println(e));
	}
	
	
	// print square numbers
	
	public static void squareNumbers(List<Integer>num) {
		
		num.stream().distinct().map((e)->e*e).forEach((e)->System.out.println(e));
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// sorted numbers using 
		
		List<Integer>numbers=List.of(20,50,60,75,65);
		
		shortingNumber(numbers); // sorted numbers
		
		List<Integer>nums=List.of(25,55,25,65,98,98);
		
		distinctnumber(nums); // distinct numbers- if number present twice it take it in count only one
	
	
		squareNumbers(nums); // Square the distinct num
		
		
	}

}
