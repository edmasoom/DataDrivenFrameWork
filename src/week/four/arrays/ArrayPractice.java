package week.four.arrays;

public class ArrayPractice {
	
	public static void main( String[] args) { 
	
	
	
	String[] socialMedia = new String[3]; 
	socialMedia[0] ="Facebook"; 
	socialMedia[1] = "Instagaram"; 
	socialMedia[2] ="Tiktok"; 
	
	//for(int i=0; i<socialMedia.length; i++)
		//System.out.println(socialMedia[i]);
	
	for(String element: socialMedia) { 
		System.out.println(element);
	}

	
	
	}
}


//int[] marks = new int[5]; 
//marks[0] = 100; 
//marks[1] = 99; 
//
//String[]name = new String[2]; 
//name[0] = "Mohammad"; 
//name[1] = "Edrees";
//name[1] = "Masoom"; 
//
//for(int i=0; i<name.length; i ++)
//	System.out.println(name[i]);