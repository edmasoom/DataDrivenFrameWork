package week.four.practiceroom;

public class Parent {

int gpa; 
int score; 
String name; 
static String course; 
String email;

// default constructor 
  Parent() { 
	this.gpa = 0; 
	this.score = 0; 
	this.name = ""; 
	course = "TeksSchool"; 
	this.email = ""; 
	}

void Print() {
	System.out.println("This is from parent");
}
// Parameterized constructor  
Parent(String name, int gpa, int score ){
	this();
	this.name = name; 
	this.gpa = gpa; 
	this.score = score; 
	
}

void print() { 
	System.out.println(
			"Your name is " + name 
			+ "  Your GPA is " + gpa + " , " + " Your score is  "  +  score + ",  " +  " Your school is " + course + email);
}


void display() { 
	System.out.println("This is from Parent");
	
	
}




}
