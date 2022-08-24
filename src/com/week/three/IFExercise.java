package com.week.three;

public class IFExercise {
	
	public static void main(String[] args) {
		
		
		//finding a and odd number
		int number= 10; 
		
		if(number %2 ==0) {
			System.out.println("This is an even number ");
		}
		

		
		
		// Check whats wrong with this code. 
		String day ="SunDay"; 
		if(day.equalsIgnoreCase("Sunday")) { 
			System.out.println("Today is " + day);
		}else if(day.equalsIgnoreCase("Monday")) { 
			System.out.println("Today is " + day);
		}else 
			System.out.println("No Match");

	}
}
		
		
		
		
//		int testScore = 59; 
//		char grade; 
//		
//		if(testScore >=90) { 
//			grade = 'A'; 
//		}else if (testScore >=80) { 
//			grade ='B'; 
//			
//		}else if(testScore >=70) { 
//			grade ='C'; 
//			
//		}else if (testScore >=60) { 
//			grade ='D';
//			
//		}else { 
//			grade = 'F'; 
//		}
//		
//		System.out.println("Your Score is = " + grade); 
//		
		

