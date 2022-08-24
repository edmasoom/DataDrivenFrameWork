package bankExampleBasic;

public class Customer {
	
	
	
	
		//variables declared 
		String firstName; 
		String lastName; 
		int accoutNumber; 
		double balance; 
		
		
		//the job of the constructor is to initialize the variables into default value  
		//if you call on this you have to provide accoutNumber; 
		public Customer(int accoutNumber) {
			
			firstName = ""; 
			lastName = ""; 
			this.accoutNumber = accoutNumber; 
			balance = 0; 
		}
		
		
		
		public Customer(int aN, String firstName, String lastName) {
			
			this.accoutNumber = aN; 
			this.firstName = firstName; 
			this.lastName = lastName;
		}
		
		
		public Customer (int Ac, String fN, String lN, double Ba) {
			
			this.accoutNumber = Ac; 
			firstName = fN; 
			lastName= lN; 
			balance = Ba; 
			
		}
	
	
		
		
		//Method for deposit that return true or false
		
		public boolean deposit(double amount) { 
			balance += amount; 
			
			if(amount >10000) {
				balance += amount; 
				System.out.println("Amount added and reported to IRS");
				return true; 
			}
			
			else if(amount <=0) {
				System.out.println("Cannot deposite zero or negative amounts");
				return false; 
			}else {
			balance +=amount; 
			System.out.println("Amount added !");
	
			return true; 
		}
	}
		
		
		
		
		
		//Method for withdraw; 
		public  boolean withdraw(double amount) { 
			
		 if(amount <=0) {
		    System.out.println("Cannot withdraw zero or negative amounts");
		    return false; 
				    
		 } else if (amount > balance) { 
			 System.out.println("Amount requested $" + amount + " is more than balance, and your "
			 		+ "current balance is " + balance);
			 return false; 
		 }else 
		 balance-=amount; 
		 System.out.println("Withdraw of " + amount + "sucessfuly withdraw, your remaining balance is"
		 		+ balance ); 
			return true; 
		}
		
		
		//checking the balance 
		
		
		
		//print customer information 
		
		public void printInfo( ) { 
			System.out.println("Full Name: " + firstName + " " + lastName
					+ " Account Number " + accoutNumber + " Balance $ : " + balance);
			
			
			
		}


}
