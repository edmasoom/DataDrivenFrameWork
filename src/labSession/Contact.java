package labSession;

public class Contact {
	
	
	//variables 
	private int phone; 
	private String email;
	private String address; 
	
	
	//default constructor 
	
	public Contact () { 
		super();
		this.phone = 0;
		this.email = " ";
		this.address = " ";
	}
	
	//Parameterized constructor 
	
	public Contact ( int  phone, String email, String address) { 
		this();
		this.address = address; 
		this.email = email; 
		this.phone = phone; 
		
		// Setters and Getters 
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//toString Method
	public String toString() { 
		
		String strPhone = phone + ""; //String.valueOf(phone); // convert int to String for phone+"; 
		String tempPhone = ""; 
		if(strPhone.length()==10) { // format the number (222)222-2222
			tempPhone = " ( " + strPhone.substring(0, 3) + " )" 
		+ strPhone.substring(3, 6) +"-" + strPhone.substring(6); 
		}else {
			 tempPhone = strPhone; 
		}
		
		
		
	return 
			" Contact [ The phone number is : " + tempPhone + 
			" The email is  " + email + 
			" The address is " + address; 
	}
	

	
	

}
