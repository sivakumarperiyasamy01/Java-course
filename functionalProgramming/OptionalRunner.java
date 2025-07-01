package com.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//predicate interface implements by Evennumber

 class Evennumber implements Predicate<Integer>{

	@Override
	public boolean test(Integer num) {
		
		return  num%2==0;
	}
 }
	
 
 // consumer interface implements by SystemConsyumer
	
 class SystemConsumer implements Consumer<Integer>{
		@Override
		public void accept(Integer number) {
			System.out.println(number);
		}	
	}
 
 
 //Function inteface implements by Squarenum
 
 class Squarenum implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer num) {
		
		return num*num;
	}
	 
 }


 
public class OptionalRunner {

	public static void main(String[] args) {
		
	// behind the scenes 
	List.of(17,20,40,63).stream()
	.filter(new Evennumber())
	.map(new Squarenum())
	.forEach(new SystemConsumer());
	
		

	/*
	 * behind the scenes 
	 *Filter
	Stream<T> filter(Predicate<? super T> predicate);
	 Predicate<T>
	boolean test(T t);
	*/
	
	/*
	  forEach
	 Consumer<? super T> action
	 void accept(T t);
	 
	 */
	
	/*
	map
	Function<? super T, ? extends R> mapper
	 R apply(T t);
	
	*/
	
	
	}
}







 
