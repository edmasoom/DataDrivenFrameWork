package bankExampleBasic;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer data = new Integer("987");
		 int newDdata = data; 
	
		 
		 System.out.println(newDdata);
		
	            
	        

	}
	

	String firstName; 
	String lastName; 
	int accoutNumber; 
	double balance; 
	
	public boolean deposit(int amount) { 
		
		if(amount >= 10000) { 
			balance+=amount; 
			System.out.println("Amount added report to IRIS submitted");
			return true; 
		} else if (amount <=0) { 
			System.out.println("cannot deposit zeor");
			return false; 
		}else
			balance+=amount; 
		System.out.println("amount added successfuly ");
		return true; 
		
		
	}

}
