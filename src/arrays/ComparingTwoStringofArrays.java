package arrays;

import java.util.Arrays;

public class ComparingTwoStringofArrays {

	public static void main(String[] args) {
		String box1[] = { "banana", "apple", "arbuz", "papaya","apple", "carrots" };
		String box2[] = { "starwberries", "almurut", "mango", "cherries", "apple", "cucumber", "arbuz" };

	    for(String str1:box1) {
	    	for(String str2:box2) {
	    		String temp="";
	    		
	    		if(str1.equals(str2)) {
	    			System.out.println( str1+ "Presents in str2");
	    		}
	    	}
	    }
		  
	}
}
