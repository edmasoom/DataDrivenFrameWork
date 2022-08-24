package week.four.arrays;

public class Array {
	
	public static void main( String[] args) { 
		
		
		/*Write a program that stores 10 values in an array
		{20,25,56,98,85,79,20,80,79,10}
		then write a logic to check if each of index values are either
		odd or not and print odd indexes?*/

		int [] numbers = {20,25,56,98,85,79,20,80,79,10};
		
		for ( int i =0; i<numbers.length; i++) { //take values index and run iteration 
			System.out.println(i);
			if(numbers[i]%2!=0) {
				System.out.println( numbers[i] + " is odd");
			}else 
		System.out.println(numbers[i] + " is even");
					}	
			
	}
	
}
		
//      String [][][]campus = new String[2][3][3];// 2 campus three class three student
//		
//		campus [0][0][0] = "Cali"; 
//		campus [0][0][1] = "Titan"; 
//		campus [0][0][2] = "Online";
//		
//		campus [0][1][0] = "Cali"; 
//		campus [0][1][1] = "Titan"; 
//		campus [0][1][2] = "In-person";
//		
//		campus [0][2][0] = "Cali"; 
//		campus [0][2][1] = "Titan"; 
//		campus [0][2][2] = "Hybrid";
//		
//		campus [1][0][0] = "Virginia"; 
//		campus [1][0][1] = "Tigers"; 
//		campus [1][0][2] = "Online";
//		
//		campus [1][1][0] = "Virginia"; 
//		campus [1][1][1] = "Tigers"; 
//		campus [1][1][2] = "Online";
//		
//		campus [1][2][0] = "Virginia"; 
//		campus [1][2][1] = "Tigers"; 
//		campus [1][2][2] = "Online";
//		
//		for (int i=0; i<campus.length; i++) { 
//			for ( int j=0; j<campus[i].length; j++) { 
//				for ( int k=0; k<campus[i][j].length; k++) { 
//					System.out.println(campus [i][j][k] + " ");
//				}
//				
//				System.out.println();
//			}
//			System.out.println();
//		}
//	}
//}
		
		
		
		
	//	String [][][] {{{},{},{}},{}}


		
		
		
		
	
//		String[][]customers = new String[7][3];
//		customers[0][0] = "Alex";
//		customers[0][1] = "male";
//		customers[0][2] = "20";
//		customers[1][0] = "victoria";
//		customers[1][1] = "female";
//		customers[1][2] = "25";
//		customers[2][0] = "john";
//		customers[2][1] = "male";
//		customers[2][2] = "30";
//		customers[3][0] = "ahmad";
//		customers[3][1] = "male";
//		customers[3][2] = "18";
//		customers[4][0] = "King";
//		customers[4][1] = "male";
//		customers[4][2] = "1";
//		customers[5][0] = "Rahim";
//		customers[5][1] = "male";
//		customers[5][2] = "5";
//		customers[6][0] = "nazanin";
//		customers[6][1] = "female";
//		customers[6][2] = "19";
//		for(int i=0;i<customers.length;i++) {
//		for(int j=0; j<customers[i].length;j++) { //customer[i].length access array inside 
//		System.out.println(customers[i][j] +"");
//		}
//		System.out.println("=====");
//		}
//		
//	}
//}
//	
//	String[][] name = {{"alex", "male", "20",},
//{"victoria","female","25"},
//{"john", "male", "30"},
//{"ahmad","male","18"},
//{"king", "male", "1"},
//{"rahim","male","5"},
//{"nazanin", "female", "19"},
//};
//	
	
	
	
//	String [][] customers = {{"Alex", "Male", "20",},
//			{"Victora", "Female", "25"},
//			{"John", "male", "18"}, 
//			
		
		
		


//		
//		int[][] table = new int[3][4];
//
//		table[0][0] = 1;
//		table[0][1] = 2;
//		table[0][2] = 3;
//		table[1][0] = 4;
//		table[1][1] = 5;
//		table[1][2] = 6;
//		table[2][0] = 7;
//		table[2][1] = 8;
//		table[2][2] = 9;
//		table[2][3] = 50;
//
//		 for (int i = 0; i < table.length; i++) {
//		for (int j = 0; j < table[i].length; j++) {
//		System.out.print(table[i][j] + " ");
//
//		}
//		 }
//		 
///	String [] name = new String[2]; 
//	int [] age = new int [2]; 
//	String [] gender = new String[2]; 
//	
//	name[0] = "Mohammad"; 
//	name[1] = "Edrees"; 
//	name[2]= "Masoom"; 
//	
//	age[0] = 18; 
//	age[1] = 18; 
//	age[2] = 18; 
//	}	 
//	}
//		
		
//	int name []= new int[7];
//	
//	String[] garage = new String[5]; 
//	garage[0] = "BMW"; 
//	garage[1] = "Audi"; 
//	garage[2] = "Benz"; 
//	garage[3] = "Tesla"; 
//	garage[4] = "Jeep"; 
//	//garage[5] = "Lexus"; // more than five gives error
//	
//	//String[]garage = {"BMW", "Audi","Benz","Tesla","Jeep"};
//	//aboe is another method of using string; 
//	
//	//System.out.println(garage[2]);
//	garage[2] = "GWagon"; // override the value of index2
//	
//	//System.out.println(garage[2]);
//	
//	
//	
//	
//	int[] counter = new int[5];
//	counter[0] = 10; 
//	counter[1] = 20; 
//	counter[2] = 30; 
//	counter[3] = 40; 
//	//System.out.println(counter[2]);
//	
//	String[] sMedia = new String[3];
//	sMedia[0] ="Facebook";
//	sMedia[1] ="Instagaram";
//	sMedia[2] ="Tiktok";
//	for(int i=0; i<sMedia.length; i++) {
//		System.out.println(sMedia[i]);
//	if(sMedia[i].equals(sMedia[2]));	
//	//if(sMedia[2].equals("Instagaram")); 
//	//System.out.println("IG");
//	
//	char[] character = new char[5]; 
//	char[] character1 = {'a', 'b','b'}; 
//	double[] doubleArray = new double[10]; 
//		
//	}
//	
//	String[] subject = {"Manual", "Automation", "API", "Java"}; // another method of array
//	}
//	
//	
//	
//		
//	}


// Array is a container object that holds a 
//fixed number of value of a single type; 
//primitive data type: 
//reference data type: 
// syntax for declare a single dimension array = datatype[] name of array //declared 
//syntax for initialization for single dimension array = 
//datatype[] name of array = new data type[size of array]