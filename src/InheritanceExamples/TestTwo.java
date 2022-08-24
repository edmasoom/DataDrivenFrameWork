package InheritanceExamples;

public class TestTwo extends BaseClass {

	public TestTwo() {
		super("Test Two");
	}

	public void testResponseFromCalifornia() {

		fromBaseClass();
		fromUtilityClass();

		System.out.println("This is from test two");
	}

}
