package collectionInter;

import java.util.*;

class Ascendingimplementation implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {

		return Integer.compare(person1.getId(), person2.getId());
	}
}

public class PersonRunner {

	public static void main(String[] args) {

		List<Person> persons = List.of(new Person("gow", 10, 'B'), new Person("siv", 1, 'A'),
				new Person("san", 3, 'C'));
		System.out.println(persons);

		ArrayList<Person> newpersonAl = new ArrayList<>(persons);

		Collections.sort(newpersonAl, new Ascendingimplementation());
		
		System.out.println(newpersonAl);

	}

}
