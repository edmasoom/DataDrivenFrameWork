package week.four.practiceroom;

public class Child extends Parent{

	
	double ranking; 
	double income; 
	
	Child() {
		System.out.println("this is the child constructor ");
	}
	
	Child(int gpa, int score, String name, String email, double ranking, double income){
		//super(name, score, gpa);
		this.ranking = ranking; 
		this.income = income; 
		
	}
	
	
	void display() {
		System.out.println("This from child ");
		
	}
	
	void message() {
		System.out.println("Child Message method");
		super.display();
	}
}

	
	