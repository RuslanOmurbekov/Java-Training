package com.java;

public class secondWayofReverseString {

	public static void main(String[] args) {
		String myString = "Java is my passion";
		int start = 0;
		int end = 0;
		String rev = "";
		
		String reversed="";
		for (int i = 0; i < myString.length(); i++) {
			rev = "" + myString.charAt(i);
			if (rev.equals(" ")||i==myString.length()-1) {
				end = i;
				String substring = myString.substring(start, end+1);
				String outcome = "";
				for (int j = substring.length()-1; j >= 0; j--) {
					outcome = outcome + substring.charAt(j);
					
				}
				reversed= reversed+outcome;
			}
			start=end;
		}
		
		System.out.println(reversed);
	}
}
