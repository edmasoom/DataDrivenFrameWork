package Exception;

import java.io.IOException;

public class ChildException extends ParentException {
	
	
	
	void print() throws IOException    {
		// TODO Auto-generated method stub
		super.print();
	
		
	}

	
	
	public static void main(String[] args) throws IOException {
		
		ChildException test = new ChildException();
		test.print();
		
		
		
	}
}

