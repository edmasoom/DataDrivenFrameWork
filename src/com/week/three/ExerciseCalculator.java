package com.week.three;

import java.util.Scanner; 

public class ExerciseCalculator {
	
	public static void main (String[] args) { 
		
		
		
		
		Scanner calculator = new Scanner(System.in); 
		
		
		
		System.out.println("Enter your school year");
		int year = calculator.nextInt();//How to add break 
		System.out.println("Enter your major");
		String major = calculator.nextLine();
		
		
		if(year == 1) { 
			System.out.println("You enjoy your time");
		} else if ( year == 2 && major == "ecnomic" ){
			System.out.println("As second year student you will be studying this ");
		} else if ( year == 2 && major == "politics" ){
			System.out.println("As second year student of politics will be studying this ");
		}else 
			System.out.println("Not match found");
		
	}
}
		
	
		
		
//		switch (year) { 
//		
//		case 1: 
//			System.out.println("As" + year + "  year student, enjoy your life");
//			break;
//		case 2:
//			switch(major) { 
//			case "Ecnomic":
//				System.out.println("As" + major + "year student, Math, Science ");
//				break; 
//			case"Politics": 
//				System.out.println("As" + major + "student, constitution, law ");
//				break;
//			}
//			default: 
//			}
//		}
//}

		
		
//		System.out.println("Please enter you first number");
//		double firstNumber = calculator.nextDouble();
//		System.out.println("Please selec your operator +, -, *, / , ^, % ");
//		char operator = calculator.next().charAt(0);
//		System.out.println("Enter your second number");
//		double secondNumber = calculator.nextDouble(); 
//		 
//		
//		double result = 0; 
//		
//		if(operator == '+') { 
//			result = firstNumber + secondNumber; 
//			System.out.println("Your result is " + result);
//		}else if ( operator == '-') { //Math.subtractExact 
//			//result = firstNumber +secondNumber; //result=Math.addExact((int)(firstNumber,(int) secondNumber;
//			result = Math.addExact((int)firstNumber,(int) secondNumber);
//			System.out.println("Your result is " + result);
//		}else if ( operator == '/') { 
//			result = firstNumber / secondNumber; // Math.floorDiv
//			System.out.println("Your result is " + result);
//		}else if ( operator == '*') { //Math.multiplyExact
//				result = firstNumber * secondNumber; 
//				System.out.println("Your result is " + result);
//		}else if ( operator == '^') { 
//			result = Math.pow(firstNumber, secondNumber); 
//			System.out.println("Your result is " + result);
//		}else if ( operator == '%') { 
//			result = Math.pow(firstNumber, secondNumber); 
//			System.out.println("Your result is " + result);
//		}else 
//			System.out.println("Wrong operator ");
//		
//		
		
		
		
		
		
	