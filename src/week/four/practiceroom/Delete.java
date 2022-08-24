package week.four.practiceroom;

public class Delete {
public static void main(String[] args) {
	

	int count = 10; 
	
	int [] fb = new int[count]; 
	
	fb[0] = 0; 
	fb[1] = 1;
	
	for(int i=2; i<fb.length; i++) { 
		fb[i] = fb[i-1] + fb[i-2]; 
		System.out.println(fb[i]);
		
	}
	
	
	
	
}
}
//	String name; 
//	
//	public Delete() { 
//		this.name = ""; 
//		
//		
//	}
//	
//	public Delete(String name) { 
//		this.name = name; 
//	}
//	
//	
//	
//	
//}
//	



//	// variables
//	String firstName;
//	String lastName;
//	int accountNumber;
//	double balance;
//	
//	public Delete () {
//		firstName = "";
//		lastName = "";
//		accountNumber = 0;
//		balance = 0;
//	}
//		
//	public Delete(int accNumber, String fn, String ln) {
//			accountNumber = accNumber;
//			firstName = fn;
//			lastName = ln;
//			balance = 0;
//		
//	}
//	
//	public boolean deposit(double amount) { 
//		
//		if(amount>10000) { 
//			System.out.println("amount" + amount + "added and IRS informed");
//			balance += amount;  
//			return true;
//			
//		}else if( amount <0) { 
//			System.out.println("cannot deposite " + amount);
//			return false; 
//		}else 
//			balance +=amount; 
//			System.out.println(amount + "Added to your account");
//			return true; 
//		}
//	
//	
//	public boolean withdraw(double amount) { 
//		if ( amount <0) {
//			System.out.println("cannot withdraw " + amount);
//			return false; 
//		} else if (balance<amount) {
//			System.out.println("amount request is more than your balance"); 
//			return false; 
//		}else
//			balance -= amount;
//		System.out.println(amount + "Withdraw succesfful");
//		return true; 
//		
//		
//		
//	}
//	public void printInfo( ) { 
//		System.out.println("Full Name: " + firstName + " " + lastName
//				+ " Balance $ : " + balance);
//		
//		
//	}
//}
//	
//
//		
//
//		
//		
		
	


