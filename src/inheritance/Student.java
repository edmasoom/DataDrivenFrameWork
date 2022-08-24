package inheritance;

public class Student extends Person {

	  private double gpa;
	  private int grade;
	    // job of constructor: initialize all of the variables of the class   
	  // keyword 'super' will let you reach the parent class    
	  // super keyword is exactly like this keyword    
	  // super refers to immediate parent class   
	  // this refers to current class    
	  // this keyword had 2 use cases    
	  // 1. this.variable    
	  // 2. this() would chain a constructor    
	  
	  
	  //constructor
	  public Student() {
	        super();   //instead of super.setName(""); or super.setEmail(""), 
	                   //this key work initialize it for us 
	        this.gpa = 0;
	        this.grade = 0;
	    }
	    public Student(double gpa, int grade, String name, String email, String phone, int age) {
	    	//super refers to person class fields not need to write them.
	        super(name, email, phone, age);
	        this.gpa = gpa;
	        this.grade = grade;
	    }
	    public double getGpa() {
	        return gpa;
	    }
	    public int getGrade() {
	        return grade;
	    }
	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }
	    public void setGrade(int grade) {
	        this.grade = grade;
	    }
}
