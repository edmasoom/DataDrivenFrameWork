package Exception;

public class TestCustomException {
	
	
	public static void age(int age)throws CustomException { 
		
		if(age<17) {
			throw new CustomException ("this is from us"); 
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
			age(16);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
