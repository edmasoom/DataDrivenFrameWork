package InheritanceExamples;
import java.util.Scanner; 

public class Runner {
	
	public static void main(String[] args) {
		
	fibCount(10); 
		
	}
	
	
	
	
	public static void fibCount (int count) { 
		  
		int [] num = new int[count]; 
		num[0] =0; 
		num[1] = 1; 
		
		for(int i=2; i<count; i++) { 
			num[i] = num[i-1] + num[i-2]; 
		}
		for(int fib: num) {
			System.out.print(fib + ",");
	
	}
	
	}
	
}
		

//		for(int i=0; i<10; i++) {
//			for(int j=0; j<i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//		for( int i=10; i>0; i--) {
//			for (int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
//	}
//}
		
//		int[] numbers = { 1, 2, 15, 14, 4, 47, 0, -5, -1, 2, 10, 15, 18 };
//		
//		
//		int min = 0; 
//		int max = 0; 
//		int sum =0; 
//		
//		for(int i=0; i<numbers.length; i++) { 
//			sum = sum+numbers[i]; 
//			
//		min = numbers[i]<min? numbers[i] : min; 
//		max = numbers[i]>max ? numbers[i] : max; 
//		
//
//		}
//		double avg = sum/numbers.length;
//		System.out.println("Sum " + sum);
//		System.out.println("Min " + min);
//		System.out.println("Max " + max);
//		System.out.println("Avg " + avg);
//		System.out.println("Count" + numbers.length);
//}
//}
		
		
//		
//		
//
//		int sum = 0;
//		int min = numbers[0];
//		int max = numbers[0];
//		
//		for (int i = 0; i < numbers.length; i++)  { 
//			System.out.print(numbers[i]);
//			sum+= numbers[i];
//			
//			if(numbers[i]<min) { 
//				min =numbers[i]; 
//			}
//			if(numbers[i]>max) {
//				max=numbers[i]; 
//			}	
//		
//		}
//		double avg = sum/numbers.length;
//		System.out.println(numbers.length);
//		System.out.println("Min = " + min);
//		System.out.println("Max = " + max);
//		System.out.println("Sum = " + sum);
//		System.out.println("Avg = " + avg); //((double) sum / numbers.length));
//		
//	
//	
//}
//}



/*	
	    // Creating the Scanner object
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter");
        String Input = sc.next();
        System.out.println(Input);
        
//		switch(days) {
//		case 1: message = "Monday";
//		System.out.println(message);
//		case 2: message = "Tuesday";
//		System.out.println(message);
//		case 3: message = "Wednesday";
//		System.out.println(message);
//		case 4: message = "Thursday";
//		System.out.println(message);
//		case 5: message = "Friday";
//		System.out.println(message);
//		case 6: message = "Saturday";
//		System.out.println(message);
//		case 7: message ="Sunday";
//		break;
//		}
//		System.out.println(message);	
	}
}


		

//		Scanner input = new Scanner(System.in); 
//		
//		System.out.println("Enter your state");
//		String state = input.nextLine(); 
//
//switch(state.toLowerCase()) { 
//case "Virginia":
//	System.out.println("you live here");
//	break; 
//case "California":
//	System.out.println("You dream to live here");
//	break; 
//	
//case "kabul":
//	System.out.println("a prison now");
//	break; 
//default:
//	System.out.println("Koja aste machem");
//}


		
		
//		double l = 10; 
//		double a; 
//		a = l*l; 
//		System.out.println("The area is " + a);
//		
//		
//		
//		
//
//		String classname;
//
//		// obj.fromBaseClas();
//		// obj.fromUtilityClass();
//
//		// Utility utility = new Utility(); // not access to base
//
//		// this is an object of test one which prints utility, base and test
//
//		TestOne object = new TestOne();
//		object.testingTitanClass();
//
//		TestTwo testTwo = new TestTwo();
//		testTwo.testResponseFromCalifornia();

	*/


