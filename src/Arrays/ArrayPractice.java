package Arrays;

import java.util.Iterator;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
	
		
		int count = 10;
		
		int [] fibNums = new int[count]; 
		fibNums [0]= 0; 
		fibNums [1] = 1; 
		
		for( int i =2; i<fibNums.length; i++) { // or fibNums<count	
		fibNums[i] = fibNums[i-1] + fibNums[i-2];
		System.out.println(fibNums[i]);
		}
	}
}

	
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 
//		
//		int sum = 0; 
//		int min = numbers[0]; // number index of zero as assumaption
//		int max = numbers[0];
//		double avg = 0; 
//		
//		for (int i=0; i<numbers.length; i++) { 
//			sum = sum+numbers[i];
//			
//			
//		if(numbers[i] > max) { 
//			max = numbers[i];
//		}
//		if(numbers[i]< min) { 
//		min = numbers[i];		
//		}
//		
//		
//		
//	} System.out.println(sum);
//	System.out.println("Its max" + max);
//	System.out.println("Its a min" + min);
//	System.out.println("Ave" + sum/numbers.length);
//	                                     // average = sum/count; 
//}
//}
		
/*	
		
	int[][][] nums = {{ { 1, 3 }, { 4, 5, 6, 2 }, { 7 }, { 9, 3, 5, 8, 7 } }};

	//System.out.println("length of nums " + nums.length);
//	System.out.println("nums[1].length " + nums[0].length);
//	System.out.println("nums[1].length " + nums[1].length);
//	System.out.println("nums[2].length " + nums[2].length);
//	System.out.println("nums[2].length " + nums[3].length);
//	System.out.println(nums.length);
	
	
	for( int i=0; i<nums.length; i++) {
	
		for( int b=0; b<nums[i].length; b++ ) { 
			
			for(int c=0; c<nums[i][b].length; c++)
			System.out.print(nums[i][b][c]);
			
		}System.out.println("");
	
	
	
}
}
}
*/
