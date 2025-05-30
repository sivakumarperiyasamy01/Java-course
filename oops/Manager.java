package oops;

import java.util.Objects;

public class Manager 
{
	private String name;

	public Manager(String name) 
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.name);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
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
		
		Manager m = (Manager) obj;
		
		return Objects.equals(name, m.name);
	}
}
