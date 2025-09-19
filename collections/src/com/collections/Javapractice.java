package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Javapractice {

	public static void main(String[] args) {
		Javapractice s1 = new Javapractice();

		  s1.list();
		// s1.set();
		// s1.map();
	
	}

	

	private void map() {

		// string is a key and integer is value
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();

		// add values to map as a key value pairs
		// we cannot have duplicate key but we can have duplicate value , it overrides
		// it does not maintain insertion order
		h1.put("lion", 10);
		h1.put("zeepra", 5);
		h1.put("tiger", 6);
		h1.put("monkey", 25);
		h1.put("cow", 2);

		System.out.println(h1);// {monkey=1, cow=2, zeepra=5, tiger=6, lion=10}

		h1.put("tiger", 6);
		h1.put("tiger", 8); // when i give duplicate key and diff value it overides the exisitng one
		System.out.println(h1);
		

		// get() retrieves the value using key
		System.out.println(h1.get("lion"));

		
		// remove entry by key
		System.out.println("item is removed " + h1.remove("cow"));
		System.out.println("removed entity from map " + h1);

		// contains key

		System.out.println("check the key contains in map or not " + h1.containsKey("monkey"));

		// contains value

		System.out.println("check the value contains or not " + h1.containsValue(10));

		// is empty

		System.out.println("check map is empty " + h1.isEmpty());

		// replace method

		System.out.println("replace lion " + h1.replace("lion", 12));
		System.out.println(h1);

		// get or default

		// It’s a safer alternative to get("mammel"), which would return null
		// if the key doesn’t exist—possibly leading to a NullPointerException
		// if you try to use that value.

		int num = h1.getOrDefault("mamel", 20);
		System.out.println(num);

		// key set()

		for (String str : h1.keySet()) {
			System.out.println("this are all keys " + str);
		}

		// print entry set()
		for (Map.Entry<String, Integer> entry : h1.entrySet()) {

			System.out.println("each set is " + entry.getKey() + " " + entry.getValue());
		}

		// using foreach method to print key value

		h1.forEach((animal, total) -> {
			System.out.println(" using foreach loop " + animal + " " + total);
		});
		// clear

		h1.clear();
		System.out.println(h1);

	}

	private void set() {
		
		/* 
		  - set is an interface it does not allow duplicates to add and not maintain insertion order and their implementing classes are 
		  
		  - Hashset class
		  - insertion order not maintain which means it doesnot have index 
		  - duplicate not allowed
		  - we cannot  add index based or access the element based on index because it doesnot maintain insertion order and does not store index based
		 
		  - Linked hashset class
		  - it maintain insertion order
		  - it doesnot allow duplicates
		  
		  - tree map 
		  - stores the object in sorted order ( asecnding)
		  - it doesnot allow duplicates 
		  
		 */
		
		
		
		HashSet al = new HashSet();
		
		al.add("hank");
		al.add("skyler");
		al.add(5);
		al.add(true);
		al.add(5.4f);
		al.add("skyler");
		al.add('s');
		
		System.out.println(al); //[skyler, 5.4, s, 5, hank, true] // not allowed duplicates

		// al.add(2, "walter"); // we cannot add or access the element based on index
		System.out.println(al); //[skyler, 5.4, s, 5, hank, true]
		System.out.println(al.contains("santhosh")); // it return true or false
		
		// System.out.println(al.get(5)); we cannot  access the element based on index
		// al.clear(); // clear all objects in data structure

		
		HashSet al2 = new HashSet();
		
		al2.add(al);  
		System.out.println(al2); // adding another hash set [[skyler, 5.4, s, 5, hank, true]]
		al2.add("mike");
		al2.add(6.9f);
		System.out.println(al2); //[6.9, [skyler, 5.4, s, 5, hank, true], mike, 55]
		System.out.println(al2.size());// 4
		System.out.println(al2.isEmpty());// false
		
		

		 LinkedHashSet s1 = new LinkedHashSet();
		 // maintain insertion order
		
		 s1.add("skyler");
		 s1.add("siva");
		 s1.add("mani");
		 s1.add("gobi");
		 s1.add("skyler");
		
		 System.out.println(s1); // [skyler, siva, mani, gobi]
		 System.out.println(s1.getFirst());// skyler
		 System.out.println(s1.contains("santhosh")); // it return true or false
		
		
		TreeSet t1= new TreeSet();
		
		t1.add("siva");
		t1.add("siva");
		t1.add("ram");
		t1.add("amuthan");
		
		System.out.println(t1); // it stores in shorted order and doesnot allow duplicates to add
		
	}
	
	
	

	private void list() {

		/* 
		  - list is an interface it allow duplicates and maintain insertion order and thier implementing classes are 
		  - 
		  - ArrayList class
		  - underneath data structure is array
		  - insertion and deletion is slow because of resizing and shifting for deletion 
		  - access particula object using index is easy
		  - duplicate allowed
		  - we can add or access the element based on index - using add , get method
		 
		  - Linked list class
		  - deletion and insertion is easy and accessing  to get particular object is slow 
		  - underneath data structure is doubly linked list
		  - it maintain insertion order
		  - it  allow duplicates
		  
		  - vector and stack class 
		  - it is legacy class - synchronised methods 
		  - it instial capacity is 10 if exceeds it increase the order 
		  - it allow duplicates 
		  
		 */
		
		
		
		ArrayList s1 = new ArrayList();

		s1.add("hank");
		s1.add("skyler");
		s1.add(5);
		s1.add(5.4f);
		s1.add(true);
		
		s1.set(1, "anbu"); // replace with specific index
		
		System.out.println("s1 printing"+s1);
		
	

		ArrayList a2 = new ArrayList();

		a2.add(s1); // inserting another list
		a2.add("lion");
		a2.add("monkey");
		a2.add("dog");

		System.out.println(a2);
		System.out.println(a2.size()); // to find length
		System.out.println(a2.contains(s1));// it will return true or false
		// System.out.println(a2.clear);

		// System.out.println(s1); // it is printing array of objects

		for (int i = 0; i < s1.size(); i++) {
			System.out.println(s1.get(i));
		}

		
		LinkedList<String> s2 = new LinkedList();

		s2.add("monkey");
		s2.add("lion");
		s2.add("cat");
		s2.add(2, "zeepra"); // position based value assign

		System.out.println(s2);// it will print array of objects
		System.out.println(s2.size());// ti gives the number of elements in this array
		System.out.println(s2.get(1));// to get particular element by specifiying index
		System.out.println(s2.remove("cat"));// if we not specify anything it will remove fist element or else it will
												// remove the specific element
		System.out.println(s2);

		// for (int i = 0; i < s2.size(); i++) {
		// System.out.println(s2.get(i));
		// }

		Vector s3 = new Vector();

		// System.out.println(s3.capacity());// intial capacity is 10 , when we add 11
		// th element it increases the double the
		// size

		s3.add("siva");
		s3.add("gow");
		s3.add("santhiya");
		s3.add("periyasamy");
		s3.add("saraswathy");
		s3.add("siva");
		s3.add("gow");
		s3.add("santhiya");
		s3.add("periyasamy");
		s3.add("saraswathy");
		s3.add("saraswathy");

		for (Object item : s3) {

			System.out.println(item);

		}

	}

}
