package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String string = "Java is my passion";
		String[] split= string.split(" ");
	    String reverseString= "";
	    String outcome="";
	    for(int i=0;i<split.length;i++) {
	    	reverseString=split[i];
	    	for(int j=reverseString.length()-1;j>=0;j--) {
	    		outcome= outcome+reverseString.charAt(j);
	    	}
	    }
	    System.out.println(outcome);
	}
}
