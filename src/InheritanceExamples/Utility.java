package InheritanceExamples;

public class Utility {
	
	
	//public final String className = "Titan Class"; 
	// once you create a constructor in Utility class, the base class wil give error; 
	// until we create a constructor to utilize the 
	public Utility(String yourName) {
	
		System.out.println("Your name is " + yourName);
//		
		System.out.println("This is from utility Constructor");
	}
	
	public void fromUtilityClass() {
		
		System.out.println("This is From utiltiy");
	}

}
