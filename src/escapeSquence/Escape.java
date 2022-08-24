package escapeSquence;

public class Escape {
	
	public static void main (String [] args) {

//		\t	It is used to insert a tab in the text at this point.
//		\'	It is used to insert a single quote character in the text at this point.
//		\"	It is used to insert a double quote character in the text at this point.
//		\r	It is used to insert a carriage return in the text at this point.
//		\\	It is used to insert a backslash character in the text at this point.
//		\n	It is used to insert a new line in the text at this point.
//		\f	It is used to insert a form feed in the text at this point.
//		\b	It is used to insert a backspace in the text at this point.
		
		int value = 30; 
		
		String s = String.valueOf(value);
		System.out.println(s+10);
		
		boolean bol = true; 
		boolean bol2 = false; 
		
		String s1 = String.valueOf(bol); 
		String s2 = String.valueOf(bol2); 
		
		System.out.println(s1 +30);
		System.out.println(s2 +30);
		
		char ch1 = 'A';
		char ch2 = 'B'; 
		
		String ss = String.valueOf(ch1);
		String ss1 = String.valueOf(ch2); 
		
		System.out.println(ss);
		System.out.println(ss1);
		
		float f = 10.5f; 
		double d = 10.2; 
		
		String ff = String.valueOf(f); 
		String dd = String.valueOf(d); 
		System.out.println(ff);
		System.out.println(dd) ;
		
		
		
		
		
		
	}

}
