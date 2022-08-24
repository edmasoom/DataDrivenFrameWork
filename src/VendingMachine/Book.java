package VendingMachine;

public class Book {

	String name; 
	int isbn; 
	String publisher; 
	int numOfPages; 
	String author; 
	
	
	
	public Book() { 
		name = ""; 
		isbn = 0; 
		publisher = ""; 
		numOfPages = 0; 
		author=""; 
	}
	public  Book (String name, int isbn, String publisher, int numOfPages, String author) {
		
		this.name= name; 
		this.isbn = isbn; 
		this.publisher = publisher; 
		this.author = author; 
		this.numOfPages = numOfPages; 
		
	}
	
	
	public String toString() {
		return "Book [name: " + name + ", isbn: " + isbn + ", publisher: " + publisher + ", numOfPages: " + numOfPages + ", author: "
		+ author + "]";
		
		
	}
	
	public int getIsbn() { 
		return isbn; 
	}
	
	public void setIsbn(int isbn) { 
		this.isbn = isbn; 
		
	}
	
	public String getPublisher() {
		return publisher; 
		
	}
	
	public void setPublisher(String publisher) { 
		this.publisher=publisher; 
	}
	
	public int getNumOfPages () { 
		return numOfPages; 
	}
	
	public void setNumOfPages(int numOfPages) { 
		this.numOfPages=numOfPages; 
	}
	
	public String getAuthor() {
		return author; 
		
	}
	public void setAuthor(String author) {
		this.author=author; 
		
	}
	
	
		
		
	
}
