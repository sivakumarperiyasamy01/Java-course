package com.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExcerciseRunner {

	// print squares of first 10 numbers
	public static void Printnumbers() {
		
		//that generates a stream of sequential integers.
		IntStream.range(1, 11).forEach((e)->System.out.println(e));
		
	}
	
	
	
	// map convert to lowerCase and print
	public static void convertLowercase(List<String>word) {
		word.stream().map(e->e.toLowerCase()).forEach((e)->System.out.println(e));	
	}
	
	
	// print length of each element
	
	public static void lengthcalculator(List<String> words) {
		words.stream().forEach((e)->System.out.println(e.length()));
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		// print squares of first 10 numbers
		
		Printnumbers();
		
		// map convert to lowerCase and print
		List<String>words=List.of("LION","TIGER","CAT","BEAR");
		
		convertLowercase(words);
		
		// print length of each element
		
		lengthcalculator(words);
		
		

	}

}
