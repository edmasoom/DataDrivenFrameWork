package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise {
	
	
	
	public static void divide(int a, int b) throws ArithmeticException { 
		System.out.println(a+b);
	
			
		}
		
		
			
			
		
		
		
		
	
	
	public static void main(String []args) { 
	
try {
		int divide = 1/0;
		System.out.println(divide);
	}
catch (Exception e) {
	System.out.println(e);
}
}
}
	/*	
		try {
		String ab = null; 
		
		System.out.println(ab.length());
		}catch (Exception e) {
			System.out.println(e + "This is captured");
		} finally { 
			System.out.println("Finally");
		}
		
		try {
	int a = 10/10; 
	System.out.println(a);
	}catch (Exception e) {
		System.out.println(e);
	}
		
		
		
	}
	
	
}
	
*/	
//	// this is a check exception and should be handled in compile time; 
//	public static void readFile(String fileName) { 
//		try {
//		FileReader reader  = new FileReader(fileName); 
//	}catch (FileNotFoundException e) {
//		System.out.println(e);
//		
//	}
//		
//		
//	}
//	
//public static void main(String[] args) {
//	readFile("fileName.txt"); 
//	
//	
//	
//	
//}	
//	
//	
//	
//	
//}

//	public static void enroll (int age, int weight ) { 
//		if (age <18) { 
//			throw new ArithmeticException("This is not allowed"); 
//		}else 
//			System.out.println("in this age " + age + weight + " your eligible");
//		
//	}
//	
//	public static void main (String [] args) {
//	
//		enroll(19, 76); 
//		
//		
//		
//	}
//}

//	try { 
//		read(); 
//	}
//	catch (Exception e ) { 
//		System.out.println("This is from method" + e);
//	}
//	
//	
//		
//		
//	}
//	
//	public static void read() throws FileNotFoundException { 
//		
//	}
//}
//		
//	public static void validateAge(int age) { 
//		if(age<18) { 
//			
//			throw new ArithmeticException("This is a custom Exception"); 
//		}
//		else { 
//			System.out.println("Your Eligible to vote");
//		}
//	}
//}
//		
		
//	try { 	
//	int data = 50/0; 	
//	System.out.println(data);
//	} 
//	catch (NullPointerException e) { 
//		System.out.println("You did something really wrong" + e);
//	}
//	finally {
//	System.out.println("End of Progra, ");
//	}
//	
//	}
//}
		
//		try {
//		int a = 100/0; 
//		} catch (Exception e) { 
//			System.out.println("You did this " + e );
//		}
//		
//		
//		try {
//		
//		String s = "Hello"; 
//		System.out.println(s.length());
//		}
//		catch (NullPointerException e) { 
//			System.out.println("Null cannot have length" + e);
//		}
//		
//		 int a [] = new int [5]; 
//		 a[6] = 15; 
		 
		
