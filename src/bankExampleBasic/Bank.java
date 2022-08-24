package bankExampleBasic;

import java.util.Iterator;

public class Bank {

	public static void main(String[] args) {
		
		
		
		Customer Obj = new Customer(123, "Walid", "Wild", 5000 ); 

		Customer Obj1 = new Customer(321, "Javid", "Jack", 6000 ); 
	
		Customer Obj2 = new Customer(231, "Danila", "Anna", 999.9 );
		
		
		
		Obj.printInfo();
	    Obj1.printInfo();
		Obj2.printInfo();
		
//		Obj.deposit(10000); 
//		
//		Obj.printInfo();
//		Obj.withdraw(5000); 
//		Obj.printInfo();
//		
//		Obj1.withdraw(7000);
		
		
		Customer [] array = new Customer[4]; 
		array[0] = Obj; 
		array[1] = Obj1; 
		array[2] = Obj2; 
		array[3] = new Customer(131313); 
		
		for (int i = 0; i < array.length; i++) {
			array[i].printInfo();
			
		}
		
		
		
		
		
	
		
		

	}

}
