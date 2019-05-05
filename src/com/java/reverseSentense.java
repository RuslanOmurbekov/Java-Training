package com.java;

import java.util.Scanner;

public class reverseSentense {
	public static String reversesentense(String inputstring) {
		String [] words=inputstring.split("\\s");
		String outputstring="";
		for(int i=words.length-1; i>=0; i--) {
			outputstring=outputstring+words[i]+" ";			
		}
		return outputstring;
	}
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PLZ enter your string:");
		String input=scanner.nextLine();
		String output=reversesentense(input);
		System.out.println("Your input is:"+input);
		System.out.println("Your output is:"+output);
		scanner.close();
		
	}
}

