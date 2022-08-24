package ClassAndObject;

public class Class {
	
	public static void main(String[] args) {
		
		
		// object of a class student 
		Student obj = new Student(); 
		
		obj.firstName = "Mohammad"; 
		obj.lastName = "Masoom"; 
		obj.age = 34; 
		
		
		Student obj2 = new Student(); 
		obj2.firstName = "Qais"; 
		obj2.lastName = "Walid"; 
		obj2.age = 25; 
		
		Student obj3 = new Student("Mohammad", "Walid", 25); 
		
		obj3.printInformation();

	
		
	}
	
	

}
