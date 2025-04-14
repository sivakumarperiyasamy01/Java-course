package collectionInter;

public class Person implements Comparable<Person>{
	
	// state members 
	
	private String name;
	private int id;
	private char Grade;
	
	// constructor 
	public Person(String name, int id, char grade) {
		super();
		this.name = name;
		this.id = id;
		Grade = grade;
	}

	
	// methods 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGrade() {
		return Grade;
	}

	public void setGrade(char grade) {
		Grade = grade;
	}
	
	
	// print the object using tostring method 
	
	public String toString() {
		return (name+ id +Grade);
	}


	@Override
	public int compareTo(Person that) {
		
		return Integer.compare(this.id, that.id);
	}
	
	

}
