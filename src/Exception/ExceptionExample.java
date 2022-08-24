package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// Stack trace is the red text that get you in the part of the exception 
		// Sand Boxing: in programming creating an isolated space to run the code. 
		// tools for exception handling in java are 
		// ---- 1. try/catch - works like if statement 
		//----- 2. throws 
		// try{this is where code goes / this is the sand box}
		// catch( the exception that you expect) { this is if exception occure } 
		// throw is passing responsibility 
		
		try { 
		System.out.println(divide(10,0));
		} catch (ArithmeticException e) { 
		
		}
		
		System.out.println("End of the excpetion");
		
		
		
		

	}
	
	public static int divide( int a, int b) { 
		return a/b; 
	}

}
