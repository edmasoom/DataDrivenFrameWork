package Exception;

public class CustomException extends Exception {
	
	public CustomException(String erroMessage)  
	    {  
	        super(erroMessage);  
	        System.out.println("This is coming from personal Exception");
	    }  
	

		
		
		
	
}
	



//	public String toString() { 
//		return super.toString()
// + "I am notString";
//		
// }
//	public String getMessage() {
//		return super.getMessage() + "This is from the  get message ";
//	}
//	
//	
//	public static void main(String[] args)  {
//		
//		int a = 8; 
//		if(a<9) {
//			
//			try {
//			throw new CustomException();
//			
//		}
//			catch (Exception e) { 
//				System.out.println(e.getMessage());
//			}
//		
//		
//	}
//	
//}
//}