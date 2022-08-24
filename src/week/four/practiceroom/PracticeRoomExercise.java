package week.four.practiceroom;

import java.util.Scanner;
public class PracticeRoomExercise {
	
	public static void main(String[] args) { 
		
	Scanner input = new Scanner (System.in); 
	
	System.out.println("Enter your integer number");
	int number = input.nextInt(); 
	while(number%3==0 || number/10==0) { 
		
		System.out.println(number);
	}
		
		
	}
	}

		
//	int [] a = {13,25,58,42,34,27,65,18}; 
//	int [] b = {23,34,21,43,98,11,16};
//	int sumEven =0;
//	int sumOdd =0;
//	
//	for(int number: a) {
//		if(number%2==0)  
//			sumEven+=number;
//		
//	}
//		for(int number2: b) { 
//		if(number2%2!=0) 
//			sumOdd+= number2; 
//
//	}System.out.println( sumOdd + sumEven);
//	}
//	}
//
//	


//	
//	for(int number2: b) { 
//		if(number2%2!=0) {
//			sumOdd+= number2; 
//		}
//		System.out.println(sumOdd);
//	}
//
//	
//	}
//	}

	
//	for( int c : a) {
//		if(c%2==0)
//	sumEven+=c;
//		
//	for(int d : b) {
//		if(c%2!=0)
//		sumOdd+=d;
//	}
	//}System.out.print(sumEven);
	//System.out.println(sumEven);
	
		

//		Scanner input = new Scanner(System.in);
//	    System.out.println("Please Enter your number ");
//	      int a = input.nextInt(); 
//	      System.out.println("Please Enter your number ");
//	    int b  = input.nextInt(); 
//	    System.out.println("Please Enter your number ");
//	    int c = input.nextInt(); 
//	    System.out.println("Please Enter your number ");
//	    int d = input.nextInt();
//	    
//	int sum = a + b + c + d; 
//	 while (true) {
//		 if(sum<=100) {
//		System.out.println( sum + "is Over a");
//		  
//	 }sum++; 
//	   
//	}
//}
//}


		
//	Scanner input = new Scanner(System.in); 
//	System.out.println("Enter three names");
//	String[] name = new String[3]; 
//	
//	for(int i=0; i<=name.length-1; i++) 
//	name [i] = input.next();
//	
//	input.close();{
//	for(int i=0; i<=name.length-1; i++) 
//	if(name[i].startsWith("M")) { 
//		System.out.println(name[i] + " I got you");
//	}
//
//		
//	}
//	
//}
//} 

		
		
		
		
		

		
		
		
		



		

//		for( char i='A'; i<='Z'; i++) { 
//			if(i=='H') {
//			break;
//			}System.out.print(i +", ");
//		}	
//}
//}

	

//			char alpha = 'a'; 
//			
//			
//			while(alpha<='z') {
//				System.out.println(alpha);
//				alpha++;
				
//			char alpha = 'a';
		

//flip the value of y and x
//int y = 20; 
//int x =10; 
//
//y = y*x; 
//x = y/x; 
//y = y/x; 
//
//System.out.println(y);
//System.out.println(x);
		
	//	Scanner input = new Scanner(System.in);
//		System.out.println("Enter your Browswer Name");
//		String browser = input.nextLine();
//		
//		
//		switch(browser) { 
//		case "Chrome":
//			System.out.println("Open Chrom Browser");
//			break; 
//		case "Edge":
//			System.out.println("Open Edge Browser");
//			break; 
//		case "FirFox": 
//			System.out.println("Open FirFox Browser");
//			break; 
//		case "Safar":
//			System.out.println("Open Safari Browser");
//			break; 
//			default: 
//				System.out.println("Not Match ");
//			
//		}
//		
//		Scanner number = new Scanner(System.in); 
//		System.out.println("Enter your number");
//		int x = number.nextInt(); 
//		
//		if(x%2==0) {
//			System.out.println("This " + x + " is an odd number");
//		}else 
//			System.out.println("This  " + x + " is an even number");
		
		
//		Scanner fuzz = new Scanner(System.in); 
//		System.out.println("Please enter your Fuzz Buzz Number");
//		int number = fuzz.nextInt(); 
//		if ((number %3==0 && number%5==0)) {
//		System.out.println("Fizz Buzz");
//		}else if(number%3==0) {
//			System.out.println("This is Fizz");
//		}else if ( number%5==0) { 
//			System.out.println("This is Buzz");
//		}else 
//		System.out.println("Not divisible by 3 and 5");
	

		
//String original = "noon"; // if you want to ignore the lowercase use equaliqnorecase
//String reverse = ""; 
//////String reverse =""; 
////int length = original.length(); 
////
//for( int i =original.length() -1; i>=0; i--)
//	reverse = reverse + original.charAt(i);
//
//if(original.equals(reverse))//equals ignore case
//	System.out.println("This is a palindrome");
//else 
//	System.out.println("This is not a palindrome");

		
//Scanner input = new Scanner (System.in);
//System.out.println("Please enter name: ");
//String name = input.next();
//String [] studentName = new String [3];
//
//
//
//for (int i = 0; i <= studentName.length-1; i++){
//studentName [i] = name;
//name = input.next();
//}
//System.out.println(studentName[0]);
//System.out.println(studentName[1]);
//System.out.println(studentName[2]);
//System.out.println(studentName[3]);
//
