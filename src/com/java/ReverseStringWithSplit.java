package com.java;

public class ReverseStringWithSplit {

	public static void main(String[] args) {

		String str = "Kyrgyzstan is my country";
		String reverse="";
		String [] split= str.split("\\s");
		String output= "";
		//String st=split+"";
		
		for(int i=0; i<split.length; i++) {
			reverse=split[i]+" ";
			for(int j=reverse.length()-1;j>=0;j--) {
				output+=reverse.charAt(j);
			}
			
		}
		System.out.println(output);
		
		
	}
	

}
