package poylmorphism;

public class Person {
	
	String firstName; 
	String lastName; 
	
	
	public Person() { 
		super(); 
		this.firstName = ""; 
		this.lastName = ""; 
		
		
	}
	
	public Person(String firstName, String lastName) { 
		this(); 
		this.firstName = firstName; 
		this.lastName = lastName; 
		
	}
	
	public String getFullName() { 
		return "Person:" + firstName + " "  + lastName; 	
				}
	
	

}
