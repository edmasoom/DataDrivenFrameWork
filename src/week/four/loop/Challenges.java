package week.four.loop;

import java.util.Scanner;

public class Challenges {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double i = 0;
		double a = 0;
		while (a<=100){
		System.out.println("Please enter your num:");
		i = input.nextDouble();
		i++;
		a+=i;
		}
		System.out.println(a);

			
		}
	}


	


		
		
//	
//		int  i = 0; 
//		while (i<=10) { 
//			System.out.print(i);
//			 i++;
//		}
//		System.out.println();
//		for( int b=0; b<=10; b++) { 
//			System.out.print(b);
//		}
//		
		
		
	
	
		
//		System.out.println("Please enter enteger number: ");
//		int [] number = new int [3]; //
//		
//		int i = 0;
//		while(i <= number.length-1) {
//		number [i] = input.nextInt();
//		if(number%3=0) { 
//			System.out.println("Found the number ");
//		i++;
//		}
//		input.close(); 
//		
//		while(i <= 0) {
//		if(number%3=0) 
//		i++;
//		System.out.println(number);
//		}
//		}
//	}
//}
//	
//} input.close();
//for( int i=0; i<= color.length-1; i++) {
//if(color[i].contains("a")) { 
//System.out.println(color[i] + "This is the color that as a letter a");

//
//String [] studentName = new String [3]; //
//
//	for (int i = 0; i <= studentName.length-1; i++){
//	studentName [i] = input.next();
//		
//		//Write a code that return factorial of number; 
		
	
		
//		int fact=1;  
//		int number=5;//It is the number to calculate factorial    
//		for(i=1;i<=number;i++){    
//		fact=fact*i;    
		
//		
//		int fact = 1; 
//		int number = 5; 
//		
//		for(int j=1; j<=number; j++ ) {
//			fact = fact*j; //fact*=j; 
//			
//		// fact = 1*1 = 1;
//			// fact = 1*2 = 2;
//			// fact = 2*3 = 6;
//			// fact = 6*4 = 24;
//			// fact = 24*5 = 120;
//			System.out.println("Your number is " + fact);
//		
//
//	}
//		
//}
//}




	
		






/**
//// reverse word	challenge
//String word = "Welcome"; 
//
//for (int i=word.length()-1; i>=0; i--) { 
//	char a = word.charAt(i); // System.out.print(word.charAt(i));
//	System.out.println(a);



// Palindrome Challenge; 

//String original = "noon"; // if you want to ignore the lowercase use equaliqnorecase
//String reverse = ""; 
////String reverse =""; 
//int length = original.length(); 
//
//for( int i =length -1; i>=0; i--)
//	reverse = reverse + original.charAt(i);
//
//if(original.equals(reverse))//equals ignore case
//	System.out.println("This is a palindrome");
//else 
//	System.out.println("This is not a palindrome");

// Fizz Buzz Exercise
//int num =0; 
//
//for( int i=1; i<=100; i++ ) {
//	
//	if ((i%5) ==0 && (i%7 ==0))
//			System.out.println("FizzBuzz");
//	else if(i%5==0)
//		System.out.println("Fizz");
//	else if (i%7 ==0)
//		System.out.println("Buzz");
//	else
//		System.out.println(i);


		// A to Z challenge 
		char a = 'a'; 
		
		for(a ='A'; a<='Z'; a++) { //lower case case A to a
			
			System.out.print(a + " "); // without space remove +""
			
	//A to Z with while 
	 * 	char a = 'a'; 
	
	while(a<='z') { 
		System.out.println(a);
		a++; 
	}
	 */


//Exericse

//String firstName ="Obaidullah";
//String lastName ="Hakimi";
//String fullName = firstName + lastName;
//String reverse ="";
//System.out.println(fullName);
//
// for (int i = fullName.length()-1;i>=0;i--) {
//reverse =reverse + fullName.charAt(i);
//}
//System.out.println(reverse);
//}

//Character c = 'a';
//System.out.println("Print from a to z with While Loop");
//while (c<='z') {
//if (c!='z') {
//System.out.print(c + ", ");
//} else {
//System.out.println(c);
//}
//c++;
//}
// the last iteration when c == 'z', then i want to make an
// exception
// if else inside the loop
//System.out.println();
//System.out.println("Print a to z with for loop");
//for (Character ch = 'a'; ch <= 'z'; ch++) {
//System.out.print(ch);
//}
//// a, b, c, d,


// string, reverse string
// String word = "Welcome";
// 0123456
// length 7
// emocleW
// starting point: index 6 = e --- initialization
// condition -- when I reach index 0
//loop update
//System.out.println();
//String word = "Welcome";
//int l = word.length();
//System.out.println(word.length());//7 , include
//System.out.println("Reverse of word");
//for (int i = l -1 ; i >= 0; i--) {
//System.out.print(word.charAt(i));
//}

// fizz buzz
// palindrome
// kayak
// racecar
// madam
// if i have a word, i want you tell me that if that is palindrome
// or not.
//String randomWord = "welcome";
//System.out.println("this is a palindrome");
// System.out.println("this is NOT a palindrome");
// dad
// 012
// dad
// i want to first reverse the word
// i want to compare the reserve with original word
// if reverse word == original word , palindrome
// else , that is not a palindrome
//System.out.println();
//for (int i = randomWord.length()-1; i>=0 ; i--) {
//Character rev = randomWord.charAt(i);
//System.out.println(rev);
//}

