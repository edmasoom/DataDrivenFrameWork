package week.four.arrays;

public class FibonacciChallenge {

	public static void main(String[] args) {
		
		// write a function that returns a sequence of fib numbers; 
		// we start with 0 1
		// every next number is the sum of the two previous numbers; 
		//0 ,1, 1, 2, 3, 5, 8, 13, 21, 34...
		
		int count = 10; 
		int [] fibNums = new int[count]; 
		
		fibNums [0] = 0; // assign the first value
		fibNums [1] = 1; // assing the second value 
		
		for ( int  i=2; i <fibNums.length; i++) { 
			fibNums[i] = fibNums[i-1] + fibNums[i-2]; 
			
		}
		for (int i: fibNums) { 
			System.out.print(i+ ", ");
		}
		
		
		
		

	}

}
