package com.functionalProgramming;

import java.util.List;

public class ExcerciseRunner {

	// tradtional way of filtering
	public static void FilterAnimals(List<String>Animal) {
		
		for(String animal:Animal) {
			
			if(animal.endsWith("at")){
				System.out.println(animal);
			}
								
		}	
		
	}
	
	//Streamapi Filter method
	
	public static void StreamFilter(List<String>Animal) {
		// filter method only sends the element if the condition met
		
		Animal.stream().filter(e->e.endsWith("at")).forEach(e->System.out.println(e));
	}
	
	
	//EvennumberFilter
	
	public static void EvennumberFilter(List<Integer>num) {
		
		num.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}

	
	// odd number filter
	public static void oddnumberfilter(List<Integer>num) {
		
		num.stream().filter(e->e%2!=0).forEach(e->System.out.println(e));
	}
	
	
	
	

	public static void main(String[] args) {
		
		List<String>Animals=List.of("cat","dog","lion","tiger");
		// filter animals
		FilterAnimals(Animals); // tradtional way of filtering
		StreamFilter(Animals);//  StreamApi way of filtering
		
		
		
		List<Integer>numbers=List.of(10,75,80,96,35);
		
		EvennumberFilter(numbers);  // even numberfiltering method
		oddnumberfilter(numbers);	// odd number filtering method

	}

}
