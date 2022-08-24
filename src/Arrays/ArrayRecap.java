package Arrays;

public class ArrayRecap {
	
	public static void main(String[] args) {
		
		
		
		int count = 1; 
		while(count<10) {
			System.out.println("count " +count);
			count++; 
		}
		
		int count1 =1; 
		do {
			System.out.println("Count 1" + count1);
			count1++; 
		}
		while(count1<10); 
		
		
		
  int [] arr = {1,2,3}; 
  
  int [] arr2 = new int[2];
  
  arr2[0] = 20; 
  System.out.println(arr2[0]);
  System.out.println(arr2);
		
  
  int[] temp = { 1, 12, 13, 15, 85, 62, 15, 12, 15 };
  System.out.println(temp[4]);//85; 
  System.out.println(temp[8]);
  
  for( int i =0; i<temp.length; i++) { 
	  System.out.println("For Loop" + temp[i]);
  }
  
  for( int b: temp) { 
	  
	  System.out.println(" for each " + b);
  }
  
  String [] names = new String [3]; 
  
  names[0] = "Walid"; 
  names[1] = "Wild";
  names[2] = "Wolding";
  
  for( String c: names) { 
	  System.out.println(c);
  }
		String name = "Walid"; 
		
	
		
	}
}
	
//int [] [] arr = new int [3][3];
//
//arr[0][0]=1;  
//arr[0][1]=2;  
//arr[0][2]=3;  
//arr[1][0]=4;  
//arr[1][1]=5;  
//arr[1][2]=6;  
//arr[2][0]=7;  
//arr[2][1]=8;  
//arr[2][2]=9; 
//
//int [][] arrTest = {{1,2,3},{2,4,5},{4,4,5}}; 
//
//for(int i=0; i<arrTest.length; i++) { 
//	for ( int b=0; b<arrTest[i].length; b++) {
//		
//		System.out.println(arrTest[i][b]);
//		
//	}
//	System.out.println();
//}
//	
	
	
	
	
	

//static int [] get() { 
//	return new int [] {10,20,30,40};
//	
//}
//
//	public static void main(String args[]){  
//	
//		int arr[]=get();  
//	for(int i=0;i<arr.length; i++) 
//	
//	System.out.println(arr[i]); 
//}}
//	
	
	


	
//	public static void main( String[]args) { 
//	
//	int [][] nums = {{1,2,3}, {4,5,6,7,8},{555}, {9,10,11,12}}; 
//
//	
//	for ( int i =0; i<nums.length; i++) { 
//		
//		for( int e=0; e<nums[i].length; e++ ) { 
//			
//			System.out.println(nums[i][e] + " ");
//			
//		}
//		System.out.println();
//		
//		int b [] = new int [5]; 
//		b[0] = 10; 
//		b[1] = 20;
//		b[2] = 30;
//		b[3] = 40;
//		b[4] = 50;
//		
//		//for( int i1 =0; i1<b.length; i1++) {
//		
//		for(int c: b)
//			
//		System.out.println(c);
		
	
	
	

