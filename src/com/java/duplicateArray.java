package com.java;

public class duplicateArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 7, 2, 4, 2, 5, 6 };
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp= arr[i];
					
				}
				
			}
			
			System.out.print(temp);
		
		}
		
	}
}
