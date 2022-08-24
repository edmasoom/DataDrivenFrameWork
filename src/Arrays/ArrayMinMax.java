package Arrays;

public class ArrayMinMax {
	
	public static void main(String[] args) {
		

	int[ ] number = {1, 2, 15, 14, 4, 47, 0, -5, -1, 2, 10, 15, 18 };
	
	int sum = 0; 
	int min = number[0]; 
	int max =number[0]; 
	double avg = 0; 
	
	for( int i = 0; i<number.length; i++) { 
		System.out.print(number[i] + ", ");
		sum+=number[i]; 
	if(number[i] <min) {
		min = number[0]; 
	}
		if(number[i]>max) { 
		max = number[i];
	
	}	
}
	System.out.println("Sum:" + sum);
	System.out.println("Min" + min);
	System.out.println("Max:" + max);
	System.out.println("Count :" +number.length);
	System.out.println("Ave:" + ((double) sum/number.length));
}
}
