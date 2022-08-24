package inheritance;

public class Person {
	
	// one class can have many sub classes   
	// one class can only have one parent class   
	// you do not inherit the constructors of the class    
	// you can access the constructor of the parent class    
	// you can not directly interact with the private variables of the parent class    
	// you get a copy of the private variables of the parent class   
	// Hierarchical inheritance    
	// Class Object is the parent of all of the classes in java    
	
	
	private String name;
    private String email;
    private String phone;
    private int age;
    
    
    
    //default constructor
    public Person() {
        this.name = "";
        this.email = "";
        this.phone = "";
        this.age = 0;
       
        
    } //parameterized constructor
    
    public Person(String name, String email, String phone, int age) {
    	this();
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
