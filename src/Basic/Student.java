package Basic;

public class Student {
	
	public static void main(String[] args) {
		
		Student obj = new Student(202, "Jawad"); 
		Student obj1 = new Student(200, "Wild");
		
		obj.display();
		obj1.display();
	
		
		
		
		
		
		
	
int num = 2; 
int pow =3; 
System.out.println(power(num, pow));


	}
	
public static int power(int num, int pow) { 
	int result = 1; 
	for( int i =0; i<pow; i++) { 
		
		result*= num; 	
	}
		return result; 
		
		
	}
	
String name; 
int rollno; 
static String college = "ITS"; 


Student(int rollno, String name){ 
	this.rollno = rollno; 
	this.name = name; 
}
public void display() { 
	
	System.out.println(rollno + name + college);
}
}
	



	
	
