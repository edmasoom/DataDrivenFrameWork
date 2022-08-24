package labSession;

public class Person {

	//declaration of variables 
	private String firstName; 
	private String lastName; 
	private int age; 
	private Contact contact; //create an object of contact 
	
	//default constructor 
	public Person() { 
		super();
		this.firstName = " "; 
		this.lastName = " "; 
		this.age = 0; 
		this.contact = new Contact();
	}	
		
	//Parameterized constructor 
	public Person (String firstName, String lastName, int age, Contact contact) { 
		this(); 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.age = age; 
		this.contact = contact; 
		
	}
		
		
	//variable getters; 
	
	
	public String getFirstName() {
		return firstName; 
	}
	
	public String getLastName() {
		return lastName; 
		
	}
	
	public int getAge( ) { 
		return age; 
	}
	
	public Contact getContact() {
		return contact; 
	}
	//variable setters; 
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	
	}
	
	public void setLastName(String lastName) { 
		this.lastName = lastName;  
	}
	
	public void setAge(int age) { 
		this.age = age; 
	}
	
	public void setContact(Contact contact) { 
		// another way  setContact (int phone, String email, String Addrees{ 
		//this.contact = new contact(phone, email, address); 
		this.contact = contact; 
	}
	
	
	//toString method; 
	public String toString () {
		return 
				" Person [The First Name is " 
				+ firstName + " Last Name is " 
				+ lastName + " and Age is " 
				+ age 
				+" Contact is " + contact + "]";  
 		
		
		
	}
	
	
}
