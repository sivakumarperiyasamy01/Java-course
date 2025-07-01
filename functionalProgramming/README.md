Functional Programming 
1) Functional Runner.java
2) Excercise Runner.java
3) SumlistRunner.java
4) IntermediatoperationRunner.java
5) StreamExcerciseRunner.java
6) StreamTerminalOperationsRunner.java
7) Optionalrunner.java
8) MethodReference.java and First class Functions

	- StreamApi
	- loop round the list
	- filter method
	- reduce method
	- in functional programming we avoid mutations (ex- keep adding to sum variable in normal loop)
	- in functional programming we are not specifying how to do it
	- Lambda expression - shortcut form of creating a function
					- multiple lines of code we have to use curly braces and explicit return keyword
					- if its a one line no need to give return keyword
	- stream
		- intermidiate operation- output returns another stream (ex-filter logic returns another stream)
		-Terminal operation - output of terminal operation either consume the elements or return one result
		- return stream only forEach method takes.
		
	-some of Stream intermeditate operations
		-can do any no of intermideate operations
		-These methods are part of the Java Streams API, introduced in Java 8.
🔹 		 Specifically, they are defined in the:
         java.util.stream.Stream interface
         -These are all intermediate operations, meaning they return a new stream and can be chained.
         
				-sorted()
				-distinct()-Distinct numbers are numbers that are different or unique — no duplicates.
				-combine distinct and shorted
				-Map - ex(find square of numbers)
				-Filter 
				-Reduce
				
				
🔷 What is IntStream.range()?
IntStream.range() is a method from the java.util.stream.IntStream class (part of Java 8+ Stream API) that generates a stream of sequential integers.


✅ Syntax:
IntStream.range(startInclusive ex(1), endExclusive ex(5))	

 If you want to include the end number:Use IntStream.rangeClosed(1,5):
 
 
 -Terminal operations examples- it give end one result
 	- reduce method		
 	- find max value using max method- in max method passing comparator implementation
 	In Java, the collect() method is a terminal operation used with the Stream API (introduced in Java 8) to transform the elements of a stream into a different form, typically a collection like a List, Set, or a Map.
It is defined in the java.util.stream.Stream interface and takes a Collector as an argument, which is a utility that defines how to accumulate elements of the stream.
 	
 	
 
- optional class methods 
	-get();
	-ispresent();
	-orElse
	-optional.empty - when there is no element present it will return like this 
	
	optional is a way to avoid returning null
		
 	
 	
 	
 	| Component             | Location                      | Purpose                               |
| --------------------- | ----------------------------- | ------------------------------------- |
| `collect()`           | `java.util.stream.Stream`     | Terminal operation on stream          |
| `Collectors.toList()` | `java.util.stream.Collectors` | Provides a collector to create a list |
| `List`                | `java.util.List`              | Interface for list collections        |
 	
 	
 	- convert IntStream.range() in to steam of numbers using Boxed()
 	
 	- List.of(17,13,29).stream().filter((e)->e%2==0).max((num1,num2)->Integer.compare(num1,num2));
$2 ==> Optional.empty
 	
 	
 	-List.of(17,13,29).stream().filter((e)->e%2==0).max((num1,num2)->Integer.compare(num1,num2)).isPresent();
 		-false
 		
 		
 	-List.of(17,13,29).stream().filter((e)->e%2==0).max((num1,num2)->Integer.compare(num1,num2)).ispresent();
 		-true
 		
 	- List.of(17,13,29).stream().filter((e)->e%2==0).max((num1,num2)->Integer.compare(num1,num2)).orElse(0);
$5 ==> 0
 		
 		
 		
 		
 		
 	Functional interface
 	- behind the scenes 
				
