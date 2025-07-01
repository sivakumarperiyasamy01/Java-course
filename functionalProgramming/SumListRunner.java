package com.functionalProgramming;

import java.util.List;

public class SumListRunner {

	// traditional way of Sum of numbers
	public static void SumofIntegers(List<Integer>num) {
		
		int sum=0;
		
		for(Integer no:num) {	
			sum=sum+no;
		}
		
		System.out.println(sum);
	}
	
	
	//using reducer method to find sum of numbers

	//80,12,63,80,45 
	
	public static void SumofList(List<Integer>num) {
		
	int sum=num.stream().reduce(0,(num1,num2)->num1+num2);
	System.out.println(sum);
	
	}
	
	// using reducer method to find sumof odd numbers
	public static void sumofoddnumbers(List<Integer>num) {
		
		int sum=num.stream().filter(e->e%2!=0).reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
			// sum list of numbers
		
		List<Integer>num=List.of(80,12,63,80,45,75,35,7);
		
		SumofIntegers(num);  // traditional way of aum
		SumofList(num);  // using reducer method to find sumof numbers
		
		sumofoddnumbers(num);//using reducer method to find sumof odd numbers

	}

}
