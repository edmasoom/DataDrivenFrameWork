package ClassAndObject;

public class Book {
	// declaration variables
	String author; 
	String title; 
	int price; 
	int pageCount; 
	
	
	//default constructor 
	
	public Book () { 
		this.author = ""; 
		this.title = ""; 
		this.price = 0; 
		this.pageCount =0 ;
	}
	//parameterized constructor 
	public Book (String author, String title) {
		
		this.author = author; 
		this.title = title; 
	
	}
	
	public Book (Book B) { 
		this.author = B.author; 
		this.title = B.title;
		}
	// method to find even and odd number 
public static void findOddEve(int num ) { 
	
	if(num%2==0)
	System.out.println(num + " is Even number");
	else 
		System.out.println(num + "is Odd number");
	}
		
	

	
	// method 
	public void printInformation () {
		System.out.println("**********************************");
		System.out.println("The Auther name is: " 
	+ author + " Title is: " 
	+ title + " Prices is: " + price 
    + "Page Number is : " + pageCount );
		
		System.out.println("**********************************");
		
	}
	

	

}
