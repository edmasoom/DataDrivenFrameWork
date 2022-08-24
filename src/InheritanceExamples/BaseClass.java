package InheritanceExamples;

public class BaseClass extends Utility {

	
	// this is constructor to satisfy the utility class constructor; 
	public BaseClass(String name) {
		super(name);
   }
	
	
	public void fromBaseClass() {
		System.out.println("It's from base class");
	}
	
	
	
}
