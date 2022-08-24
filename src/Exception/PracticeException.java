package Exception;

public class PracticeException {
	
	public static void main(String[] args) {
		
		try {
			count(10, 20);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		
		
			
		}	
	public static void  count(int a, int b) throws InterruptedException { 
		Thread.sleep(1000);
 
		System.out.println(a+b);
		
		
}
}

