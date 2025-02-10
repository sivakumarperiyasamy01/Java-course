package oops;

import java.util.Objects;

public class Employee 
{
   public Employee(String name) 
   {
        this.name = name;
   }

   @Override
	public int hashCode() 
   {
		return Objects.hash(name);
    }
   
   @Override
   public boolean equals(Object obj) 
   {
	   if(this == obj)
	   {
		   System.out.println("Two references pointing to the same object in the memory");
		   return true;
	   }
	   
	   if(obj == null)
	   {
		   return false;
	   }
	   
	   if(getClass() != obj.getClass())
	   {
		   return false;
	   }
	   
	   Employee emp = (Employee) obj;
	   return Objects.equals(name, emp.name);
   }

   private String name;
   
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
