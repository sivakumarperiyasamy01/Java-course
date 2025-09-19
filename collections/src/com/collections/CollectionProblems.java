package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class CollectionProblems {

	public static void main(String[] args) {

		CollectionProblems c1 = new CollectionProblems();

		// c1.shortedHashMap();
		// c1.printArrayList();
		// c1.arraylistiterator();
		c1.findfrequencyinArrayList();
		// c1.frequencyListusingHashMap();
		//c1.compareelementsinCollection();
		//c1.removespecificelement();

	}

	@SuppressWarnings("removal")
	private void removespecificelement() {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(9);
		list.add(5);
		list.add(4);
		list.add(2);

		
		list.remove(1); // index based remove
		System.out.println(list);// [10, 5, 4, 2]
		
		
		
	}

	private void compareelementsinCollection() {

		// Time Complexity: O(N), where N is the length of the list.
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(9);
		list.add(5);
		list.add(4);
		list.add(2);

		System.out.println(list);// [10, 9, 5, 4, 2]

		// find maximum and minium in collection list

		int minnum = Collections.min(list);// it return minium element of given collection
		// autoboxing and unboxing
		System.out.println(minnum);// 2

		int maxnum = Collections.max(list);
		System.out.println(maxnum); // 10

		if (maxnum == minnum) {
			System.out.println("both are equal");
		}

	}

	private void frequencyListusingHashMap() {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("siva");
		a1.add("siva");
		a1.add("murugan");
		a1.add("gowtham");
		a1.add("saraswathy");

		// it doesnot maitain the insertion order
		HashMap<String, Integer> h1 = new HashMap<>();

		for (String name : a1) {

			h1.put(name, h1.getOrDefault(name, 0) + 1);
			// get default will return value of key if exist in the hash map or else it will
			// return the default value we given
			// key wont allow duplicates so the value got updated means overide the value
			// getOrDefault(name, 0) 0 intally it will return value of key if it is exist in
			// h1 hashmap or return 0

			// h1.put(siva, 0 + 1);
			// h1.put(siva, 1 + 1);
			// h1.put(murugan, 0 + 1);
			// h1.put(gowtham, 0 + 1);
			// h1.put(saraswathy, 0 + 1);

		}

		// we gonna print the added mapping in hashmap

		for (Map.Entry<String, Integer> h1entry : h1.entrySet()) {

			System.out.println(h1entry.getKey() + " " + h1entry.getValue());

		}

	}

	private void findfrequencyinArrayList() {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("siva");
		a1.add("siva");
		a1.add("kumar");
		a1.add("gow");
		a1.add("kabil");
		a1.add("dev");
		a1.add("siva");

		ArrayList<String> counted = new ArrayList<>();

		for (int i = 0; i < a1.size(); i++) {

			String name = a1.get(i);

			if (!counted.contains(name)) { // if counted list doesnot contain the name then do follow

				int count = 0;

				for (int j = 0; j < a1.size(); j++) {

					if (name.equals(a1.get(j))) {
						count++;
					}

				}

				System.out.println(name + ": " + count + "times");
				counted.add(name);
				System.out.println(counted);

			}

		}

	}

	private void arraylistiterator() {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("siva");
		a1.add("kumar");
		a1.add("gow");
		a1.add("kabil");
		a1.add("dev");

		ListIterator<String> iteration = a1.listIterator();
		// a1.listiterator(); it returns the object that object stored in listiterator
		// type interface

		while (iteration.hasNext()) { // it check from the first element if it is available it return true
			// printing forward
			System.out.println(iteration.next());
		}

		while (iteration.hasPrevious()) { // it check from the last element if it is available it return true
			// printing backward
			System.out.println(iteration.previous());

		}

	}

	private void printArrayList() {

		ArrayList a1 = new ArrayList();

		// array list accepts all kind of objects

		a1.add("monkey");
		a1.add(true);
		a1.add(4.2f);
		a1.add(52);
		a1.add("lion");

		for (Object items : a1) {
			System.out.println(items);
			System.out.println(items.getClass());
		}

		for (Object sr : a1) {
			try {
				String str = (String) sr;
				System.out.println(str);
			} catch (ClassCastException e) {

				System.out.println(e.getMessage());
			}

		}

		for (int i = 0; i < a1.size(); i++) {

			try {
				String str = (String) a1.get(i);
				System.out.println(str);
			} catch (ClassCastException e) {

				System.out.println(e.getMessage());
			}

		}

	}

	private void shortedHashMap() {
		// it doesnot maintain insertion order
		// not allow duplicate key values
		HashMap<String, Integer> sm = new HashMap<String, Integer>();

		sm.put("apple", 1);
		sm.put("guva", 5);
		sm.put("mango", 10);
		sm.put("orange", 6);
		sm.put("pinapple", 12);

		System.out.println(sm);// {orange=6, apple=1, pinapple=12, guva=5, mango=10}
		System.out.println(sm.entrySet());// [orange=6, apple=1, pinapple=12, guva=5, mango=10]

		// sort this based on key

		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(sm);

		System.out.println(sorted);

		for (Map.Entry sort : sorted.entrySet()) {

			System.out.println("each entry sorted set be like " + sort);
		}

	}
}
