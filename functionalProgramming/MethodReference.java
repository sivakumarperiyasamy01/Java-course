package com.functionalProgramming;

import java.util.List;

public class MethodReference {

	public static boolean evennum(Integer num) {
		return num%2==0;
	}
	
	
	
	
	
	public static void main(String[] args) {

	List.of(10,80,90,60,35,47)
	.stream()
	.filter(e->e%2==0)
	.forEach(e->System.out.println(e));
	
	/* 
	 * Method Reference- enhanced version of above code
	 	 -by referencing classname and method
	 	- by referencing instance of class method
	 
	 */
	
	List.of(10,80,90,60,35,47)
	.stream()
	.filter(MethodReference::evennum)//MethodReference::evennum refers to a  custom method reference to the  evennum method of the MethodReference class
	.forEach(System.out::println);//System.out::println refers to a method reference to the println() method of the System.out class
	
	List.of("apple","cat","dog","cow")
	.stream()
	.map(e->e.length())
	.forEach(e->System.out.println(e));
	
	
	/* 
	 * Method Reference- enhanced version of above code
	 	-by referencing classname and method--- ClassName::methodName
	 	- This is a method reference to an instance method of a specific object (not the class).--objectName::instanceMethodName
	 
	 */
	
	List.of("apple","cat","dog","cow")
	.stream()
	.map(String::length)   //String::length refers to a method reference to the length() method of the String class.
	.forEach(System.out::println);//System.out::println refers to a method reference to the println() method of the System.out class
	
	
	
	
	/* First class Functions 
	 * 	-Passing a method to function
	 *  -Storing function to a variable
	 *  -return a Function from function
	
	
	
	*/
	
	// examples of First class Function 
	
	List<String>words=List.of("apple","cat","sandles","shoe","phone");
	
	
	// String str=Printwords(words);
	
	
	
	
		
	}

}
