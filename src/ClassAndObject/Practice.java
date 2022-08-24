package ClassAndObject;

public class Practice {


		
		private String email; 
		private String name; 
		
		
		//constructor 
		
		public Practice () { 
			email = ""; 
			name = ""; 
		}
		
		public Practice (String email, String name) { 
			this.email = email; 
			this.name = name; 
		}
		
		public String getEmail( ) { 
			return email; 
		}
		public void setEmail(String email) {
			this.email=email;
		}
		
		public String getName() {
			return name; 
		}
		
		public void setName(String name) { 
			this.name = name;
		}
		
		public String toString() { 
			return "Your name is " + name + "  your email is " + email;
		}

public static void main(String[] args) {
	
	
	Practice obj = new Practice("Ed@gmail.com","Mohammad"); 
	
	System.out.println(obj);
	
}	

}
