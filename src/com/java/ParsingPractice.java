package com.java;

public class ParsingPractice {
	public static void main(String[] args) {
		String s = "123";
		String t = "234";
		
		System.out.println("s + t = " + (s + t));
		
		System.out.println("s + t = " + (Integer.parseInt(s) + Integer.parseInt(t)));
	}
}
