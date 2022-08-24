package VendingMachine;

public class Product {
	
	// constructor chaining
		// is a method of calling another constructor at the beginning of your
		// constructor
		// 1. it must the first statement of the constructor
		// this()

		// variables
		String name;
		double price;
		int row;
		int col;
		int quantity;

		// default constructor - initialize all of the variables to the default value
		public Product() {
			this.name = "";
			this.price = 0;
			this.row = 0;
			this.col = 0;
			this.quantity = 0;
		}

		// Parameterized constructor 1 - initialize all of the variables to default
		// value
		// and assign the values we get in as parameters to those variables
		public Product(String name) {
			this();
			this.name = name;
		}

		// Parameterized constructor 2
		public Product(String name, double price, int quantity) {
			this();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		// Parameterized constructor 3
		public Product(String name, double price, int quantity, int row, int col) {
			this(); // if add any new variables
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.row = row;
			this.col = col;
		}

		// increase quantity will take a number and add to the quantity
		public void increseQty(int amount) {
			if (amount <= 0) {
				System.out.println("Can not increase the quantity by zero or negative numbers.");
			} else {
				quantity += amount;
				System.out.println("Quantity of the product (" + name + ") increased. New Quantity: " + quantity);
			}
		}

		// decrease quantity will take a number and subtract from the quantity
		public void decreseQty(int amount) {
			if (amount <= 0) {
				System.out.println("Can not decrease the quantity by zero or negative numbers.");
			} else if (amount > quantity) {
				System.out.println("Do not have that amount avaialbe. Current stock is " + quantity);
			} else {
				quantity -= amount;
				System.out.println("Quantity of the product (" + name + ") decreased. New Quantity: " + quantity);
			}
		}

		// Method "public String toString(){}"
		// this is a special method that comes with java.
		// this method defines what gets printed,
		// if you just print the name of the object

		@Override
		public String toString() {
			return "Product [name: " + name + ", price: " + price + ", quantity: " + quantity + ", row: " + row + ", col: "
					+ col + "]";
		}
		
	}
	
	
	
	

