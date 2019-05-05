package com.java;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 27, 2, 9, 4, 12, 89, 3 };
		int temp = 0;
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					

				}

			}
		}
           System.out.println((arr));  
	}
}
