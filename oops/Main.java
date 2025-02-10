package oops;

public class Main 
{
	public static void main(String[] args) 
	{
		 Employee emp1 = new Employee("Gowtham");
		 
	     Employee emp2 = emp1;
	
	     System.out.println("Scenario 1"+ " "+emp1.equals(emp2));
	     
	     Manager m1 = new Manager("Saraswathy");
	     
	     System.out.println("Scenario 2" + " "+ emp1.equals(m1));
	}
}
