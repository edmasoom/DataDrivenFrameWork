package Exception;

import java.io.IOException;

public class ParentException {
	
	
	void print ()  throws IOException { 
		System.out.println("From Parent");
	}

}

// if parent doesn't declare exception child can declare only uncheck exception 

 // if the parent declare an exception and child declare the parent exception child it will work 
// if the child exception is the child exception of parent class it will work