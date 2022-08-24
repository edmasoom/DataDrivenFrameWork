package ClassAndObject;

public class Student {
	
	
	//variables declared  
	String firstName; 
	String lastName; 
	int age; 
	
	// constructor - access modifier name of class (args/parameters) {body of method} 
	// initialize to default value; 
	public Student () { 
		firstName = ""; 
		lastName = ""; 
		age = 0;
	}
	// constructor created to initialize the variables
	public Student (String firstName, String lastName, int age) { 
		
		this.firstName = firstName;
		this.lastName = lastName; 
		this.age = age; 
		
	}
	
	//create a method: print 
	
	public void printInformation() { 
		System.out.println("First Name " + firstName + "Last Name: " + lastName+ "Age: " + age);
		
		
		
		
	}
	
	
	
	
	

}
