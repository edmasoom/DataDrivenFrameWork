package InheritanceExamples;

public class LeadChild extends Lead {
	
	int height; 

	LeadChild(String name, String address, int age, int height ) {
		super(name, address, age);
		this.height = height; 
		// TODO Auto-generated constructor stub
	}
	
	public String toString () {
		return name + address + age + height; 
		
	}

}
