package inheritence;

public class Employee {
	
	private String name;
	private int id;
	private String designation;
	
	
	Employee(String name, int id, String designation){
		this.name=name;
		this.id=id;
		this.designation=designation;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
