package com.week.three;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) { 
		
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first number");
    double firstNumber = scanner.nextDouble(); 
    System.out.println("Enter your second number");
    double secondNumber = scanner.nextDouble();
    System.out.println("Please select your operator +  -  * / % odd");
    char operator = scanner.next().charAt(0); // for char the next syntax is 
    
    double result = 0; 
    
    
    switch(operator) { 
    case '+':
 //   if(operator == '+') 
    	result = firstNumber + secondNumber; 
        System.out.println("The result is " + result);
        break; 
    case '-':
    	result = firstNumber - secondNumber; 
    	System.out.println("The result is " + result);
    	break;
    
    case '*':
    	result = firstNumber - secondNumber; 
    	System.out.println("The result is " + result);
    	break;
    	
    case '/':
    	result = firstNumber - secondNumber; 
    	System.out.println("The result is " + result);
    	break;
    	
    case '%':
    	result = firstNumber % secondNumber; 
    	System.out.println("The result is " + result);
    	break;
    	
   
    default: System.out.println("Wrong operator");	
    }
    
		
		
	}

}
