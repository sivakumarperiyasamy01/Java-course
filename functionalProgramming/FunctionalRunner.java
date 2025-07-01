package com.functionalProgramming;

import java.util.List;

public class FunctionalRunner {

	// loop around the list of String in traditional way
	
	public static void programbasics(List<String>items)
	{
		for(String item:items) {
			System.out.println(item);
		}
	}
	
	//loop around the list of String  using steamApi
	
	public static void streamRunner(List<String>items) {
		
		items.stream().forEach((e)->System.out.println(e));
		
	}
	
	
	// loop around the list of numbers using steamApi
	
	public static void streamNumbers(List<Integer>num) {
		
		num.stream().forEach((e)->System.out.println(e));		
	}
	
	
public static void main(String[] args) {
		
		List<String>words= List.of("apple","mango","orange","banana");
		
		 programbasics(words);// loop around the list of String in traditional way
		 
		streamRunner(words); // print the list using steamApi
		
		List<Integer>nos=List.of(10,50,60,80);
		
		streamNumbers(nos); // loop around the list of numbers using steamApi
		
	}
	

}
