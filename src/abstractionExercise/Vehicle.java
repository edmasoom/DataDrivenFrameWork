package abstractionExercise;

abstract public class Vehicle {
	
	abstract void bike(); //abstract method 
	
	void print() { // non abstract method
		System.out.println("This is non Abtract method from vehilce");
		
	
	}
	
	abstract void display(); 
	abstract void display(String msg); 

}
