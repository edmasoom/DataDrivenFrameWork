package poylmorphism;

public class Bike {
	
String firstName; 
String lastName; 

public Bike() { 
	this.firstName = ""; 
	this.lastName = ""; 
}

public Bike(String firstName, String lastName) { 
	this(); 
	this.firstName = firstName; 
	this.firstName = lastName;
}
 public String getFullName() { 
	 return "Person : " + firstName + lastName;  
 }

 
}
