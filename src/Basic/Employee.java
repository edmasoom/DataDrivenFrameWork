package Basic;

public class Employee {
	
	String name; 
	int age; 
	static String company = "Apple"; 
	static int count = 0; 
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	public void count() {
		
		count++; 
		System.out.println(count);
		
	}
	
	
	public void print () { 
		System.out.println("Name " + name + " Age " + age + " Company " + company);
	}
	
	
	public static void main(String[] args) {
		
		
	
	
		
	}

}
