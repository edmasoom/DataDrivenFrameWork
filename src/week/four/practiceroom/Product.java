package week.four.practiceroom;

public class Product {
	
	String name; 
	double price; 
	int row; 
	int col; 
	int quantity; 
	
	
	public Product() { 
		this.name = ""; 
		this.price = 0; 
		this.row = 0;
		this.col  = 0;
		this.quantity = 0; 
	}
	
	public Product (String name) { 
		this(); 
		this.name = name; 
		
	}
	public Product( String name, double price, int quantity) { 
		
		this(); 
		this.name = name; 
		this.price =  price; 
		this.quantity = quantity;
	}
	public Product( String name, double price, int quantity, int col, int row) { 
		
		this(); 
		this.name = name; 
		this.price =  price; 
		this.quantity = quantity;
		this.row = row; 
		this.col = col; 
		
	}
	
	public String toString() { 
		
		return 
				"Product [Name: " + name 
				+ " Price:" + price 
				+ "Quantity" + quantity 
				+ "Row " + row
				+ "Col " + col; 
		
	}
	

	
	//method increase quantity 
	
	public void increase(int amount) { 
		if(amount<=0) { 
			System.out.println("Cannot increase quantity by zero or negative");
		} else 
		quantity += amount; 
		System.out.println("Quantatiy of product is increased by " + amount + " new quantity" + quantity );
}
	
	public void decrease(int amount) { 
		if(amount<=0) { 
			System.out.println("Cannot decrease quantity by zero or negative");
		} else 
		quantity -= amount; 
		System.out.println("Quantatiy of product is decreased by " + amount + " new quantity" + quantity );
}
}






