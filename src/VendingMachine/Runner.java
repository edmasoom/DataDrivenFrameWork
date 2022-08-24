package VendingMachine;

import week.four.practiceroom.Vending;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Book obj1 = new Book("Hurr", 123, "Wild", 300, "1313"); 
		System.out.println(obj1.getIsbn());
		
		
		Product p1 = new Product("M&M", 3.99, 40); 
		p1.row =1; 
		p1.col = 1; 
		
		
		vendingMachine titanMachine = new vendingMachine(); 
		
		titanMachine.addProduct(p1); 
		System.out.println(titanMachine);
		
	
		
	
		
		
		
	}

}
