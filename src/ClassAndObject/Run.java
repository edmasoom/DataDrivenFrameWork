package ClassAndObject;
import java.util.Scanner; 

public class Run {

	public static void main(String[] args) {
	
		
		// to make an object of a class
		// data-type name = new constructor(args);
	 
		Book obj = new Book("Walid", "Wild"); 
		System.out.println(obj.title +  obj.author);
		
		
		Teacher ob = new Teacher("Mohammad " , " Masoom ", 35); 
		ob.printTeacherInfo(); 
		
		Teacher obj2 = new Teacher("Masih", "Holand", 35); 
		
		obj2.printTeacherInfo();
	
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter your Number");
		int num = input.nextInt(); 
		Book.findOddEve(num);
		
		
		
		for (int i=0; i<10; i++) { 
			if( i >5) { 
				break; 
			
			
		} System.out.println(i );			
	
	
	int arry [] = {1,2,3,4,5}; 
	
	for(int e=0; e<arry.length; e++) { 
		System.out.print(e);
	}


	}

}
}
