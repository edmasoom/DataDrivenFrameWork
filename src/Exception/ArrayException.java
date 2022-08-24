package Exception;

import java.util.Scanner;

public class ArrayException {
	
	public static void main(String[] args) {
		
		
	

		
		int [] index = new int[4]; 
		index [0] = 10; 
		index [1] = 20;
		index [2] = 30;
		index [3] = 40;
		
		
Scanner input = new Scanner(System.in);
System.out.println("Enter your Index number");
try {
int number = input.nextInt();
System.out.println(index[number]);
}catch (Exception e ) {
	System.out.println(e + " something is wrong and needs attentions ");
}
finally {
System.out.println("This is from finally");


}
	}}
	
	
	


