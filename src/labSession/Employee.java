package labSession;

public class Employee extends Person {

	private double salary; 
	private double totalSalesToDate; 
	
	
	
	public Employee() { 
		super();
		this.salary = 0;
		this.totalSalesToDate =0; 
		
	}
	
	public Employee(double salary, double totalSalesToDate) { 
		this(); 
		this.salary = salary; 
		this.totalSalesToDate = totalSalesToDate; 
		
		
	}
	
	public double getSalary() { 
		return salary; 
	}
	
	public double getTotalSalesToDate() { 
		return totalSalesToDate; 
		
	}
	
	public void setSalary( double salary) { 
		this.salary = salary; 
		
	}
	
	public void setTotalSalesToDate(double totalSalesToDate) { 
		this.totalSalesToDate = totalSalesToDate; 
		
	}
	
	public String toString () { 
		
		return 
				"Employee[ Salary: " + salary 
				+ "Total Sales to Date : " + totalSalesToDate +"]"; 
	}
	
	
	
	
}
