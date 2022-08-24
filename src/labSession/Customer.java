package labSession;

public class Customer extends Person {
	
	private Person refferedBy; 
	private Employee supportAgent; 
	private String customerCategory; 
	private double totalPurchaseToDate; 
	
	public Customer () { 
		super(); 
		this.refferedBy = new Person(); // you initialize the object by calling default constructor 
		this.supportAgent = new Employee(); // the new employees refers to default constructor of em class
		this.customerCategory = ""; 
		this.totalPurchaseToDate = 0; 
		
	}
	
	public Customer ( Person refferedBy, Employee supportAgent, String customerCategory, 
			double totalPurchaseToDate) {
		
		this();
		this.refferedBy = refferedBy; 
		this.supportAgent= supportAgent; 
		this.customerCategory = customerCategory; 
		this.totalPurchaseToDate = totalPurchaseToDate; 
		
		 
	}
	
	public Person getRefferedbBy() {
		return refferedBy; 
	}
	
	public void setRefferedyBy( Person refferedBy) {
		this.refferedBy = refferedBy; 
	}
	
	public Employee getSupportAgent() { 
		return supportAgent; 
		
	}
	
	public void setSupportAgent (Employee supportAgent) { 
		this.supportAgent = supportAgent;
	}
		
	public String getCustomerCategory() {
		return customerCategory; 
	}
	
	public void setCustomerCategory (String customerCategory) { 
		this.customerCategory = customerCategory; 
	}
	
	public double getTotalPurchaseToDate() { 
		return totalPurchaseToDate; 
		
	}
	public void setTotalPurchaseToDate( double totalPurchaseToDate) { 
		this.totalPurchaseToDate = totalPurchaseToDate; 
	}
	
	
	public String toString( ) { 
		return 
				" Customer [refferedby:" + refferedBy 
				+ ", supportAgent" + supportAgent + ", Customer Category" + customerCategory 
				+ ", Total Purchase to date " + totalPurchaseToDate; 
				
	}
}
