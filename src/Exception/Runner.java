package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
		
		public static void main(String[] args) {
			
			
	String name = "Mohammad Edrees Masoom"; 
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
	
	for(int i =0; i<name.length(); i++) { 
		if(map.containsKey(name.charAt(i))) { 
			int currentCount = map.get(name.charAt(i)); 
			int newCount = currentCount +1; 
			map.put(name.charAt(i), newCount); 
			
		} else 
			map.put(name.charAt(i), 1); 
	}
	System.out.println(map);
			
			/*
			 * 	String str = "this is a test string that you need to count the number of occurence of each character";
			
			HashMap<Character, Integer> chars = new HashMap<Character, Integer>(); 
			
			for (int i = 0; i < str.length(); i++) {
				if(chars.containsKey(str.charAt(i))) {
					int currentCount = chars.get(str.charAt(i));
					int  newCount = currentCount+1; 
					chars.put(str.charAt(i), newCount);
				} else { 
					chars.put(str.charAt(i), 1); 
				}
				
			}
			System.out.println(chars);
			 */
			
			
			int[] temp = { 1, 2, 5, 4, 8, 1, 5, 4, 8, 4, 5, 23, 1, 5 };
			//System.out.println(temp.length);
			
			for (int i = 0; i < temp.length; i++) {
			//	for (int j = 0; j < temp.length; j++) {
				Arrays.sort(temp);
					System.out.print(temp[i] + ", ");
					 
				}
				
			 System.out.println();
		
			
		
			
			
		ArrayList <Integer> test = new ArrayList<Integer>(); 
		
		test.add(100); 
		test.add(50); 
		test.add(90); 
		test.add(20); 
		
		System.out.println(test);
		Collections.sort(test);
		System.out.println(test);
			
		}
}	

//	for ( int i=10; i>=0; i--) { 
//	
//		try { 
//		Thread.sleep(1000);
//		} catch (InterruptedException e) { 
//			System.out.println(e);
//		}
//		System.out.println(i);
//	}
//		
//		}
//	
//			
//	public static String readFile(String path)  {
//			
//		File myFile = new File(path);
//		try {
//		Scanner reader = new Scanner(myFile); 
//		return reader.nextLine();
//		}catch (FileNotFoundException e) { 
//			System.out.println(e + " I mantually figured this out for you my Son ");
//		}
//		return "";
//	
//			
//}		
//	
//}
//				
		
			
//		String num = "123"; 
//		//int num2 = Integer.parseInt(num); 
//		System.out.println(num + 2);
//			
//	int a = 10; 
//	int b = 0; 
//	
//	try {
//	int result = a/b; 
//	System.out.println(result);
//	} catch (Exception e) { 
//		System.out.println(e);
//	}
//	finally { 
//		System.out.println("This is from Finally");
//	}
//	
//	// in absence of try and catch this code will not execute only exception in the console.  
//	System.out.println("This code will not execute");
//			
//		} 
//		
//}
