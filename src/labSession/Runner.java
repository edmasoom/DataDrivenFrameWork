package labSession;

public class Runner {
public static void main(String[] args) {
	
	Employee emp = new Employee(25000, 100000);
	Contact c = new Contact(1234567891, "ee@gmail.com", "NorthOlive");
	Person person = new Person("Bob","Bull", 25,c);
	
	
	// person class expect an object of contact 
	//we should have the object to use the person constructor 		
	//new Contact(23434234, "ee@gmail.com", "NorthOlive")); 
	//System.out.println(person);
	
	//Array of Customers 
	Customer [] customers = new Customer [5]; 
	customers[0] = new Customer();
	customers[1] = new Customer(person, emp, "Sales", 10000);
	customers[2] = new Customer(person, emp, "Sales", 10000);
	customers[3] = new Customer();
	customers[4] = new Customer();
	
	
	for (Customer customer: customers) {
		System.out.println(customer);
		
	}
	
	
	
	
	
	
	
	

	
}
}
