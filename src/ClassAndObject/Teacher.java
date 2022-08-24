package ClassAndObject;

public class Teacher {
	
	
	String firstName; 
	String lastName; 
	int age; 
	
	// default constructor 
	public Teacher () { 
		
		firstName = ""; 
		lastName = "";
		age = 0; 
		
	}
	
	// with parameters constructor 
	public Teacher (String firstName, String lastName, int age) { 
		
	this.firstName = firstName; 
	this.lastName = lastName; 
	this.age = age; 
		
	}
	
	//function 
	
	// Method 
	public void printTeacherInfo ( ) { 
		System.out.println("********************************************");
		
		System.out.println("First Name: " + firstName + "Last Name: " + lastName + "Age:" + age);
		
		System.out.println("********************************************");
	}
}
