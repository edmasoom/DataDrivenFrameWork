package InheritanceExamples;

public class TestOne extends BaseClass{
	
	
	public TestOne() {
		super("Test One");
	}
//	
	public void testingTitanClass(){
	// you can directly access the method in base and utility class; 
		fromUtilityClass();
		fromBaseClass();
		System.out.println("This is from test one");
	}
	
		
	

}
