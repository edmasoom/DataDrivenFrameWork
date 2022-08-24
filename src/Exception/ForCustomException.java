package Exception;

public class ForCustomException {
	
	public static int test(int number, int numberb) throws ArithmeticException { 
		int result = number + numberb; 
		if(number + numberb > 100) { 
			throw new ArithmeticException();
		}
		return result;

		}
	
	public static void count(int a, int b) {
		
		if(a > b) {
			throw new ArithmeticException(); 
			
		}
	}
	
	
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }
    }
        
	
	
	

	
	static void validate(int age) throws CustomException{ 
		if(age<18) { 
			throw new CustomException("Exception Constructor ");
		}
		else 
			System.out.println("Welcome please");
	}
	
	
	
	public static void main(String[] args) {
		
	try { 
		validate(17); 
	} 
	catch  (CustomException e) { 
		System.out.println("Caught the custom exception" + e);
	}
	
	System.out.println(test(100,20)); 
 
	
	}
	
	public static void main1(String[] args) {
	
		
		count(10, 4);
		
	}
	 

}
