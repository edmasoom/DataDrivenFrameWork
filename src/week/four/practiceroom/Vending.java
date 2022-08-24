package week.four.practiceroom;

public class Vending {
	
	//3 * 4;
	
	Product [][] machine; 
	
	public Vending() { 
		machine = new Product [3][4]; 
		
	}
	
	
	public void add(Product p) { 
		machine [p.row][p.col] = p;
	}
	
	// method add product: 
	
	public void add(String name, double price, int quantity, int row, int col) {
		
		Product temp = new Product(name, price, quantity, col, row);
		machine [row][col] = temp;
		
		
	}

}
