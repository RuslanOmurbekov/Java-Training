package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SortArrayList {

	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 1, 4, 9, 7 };
		int [] result=SortArrayList.sort(arr1);
		System.out.println(Arrays.toString(result));
		
		
	}
		
		public static int [] sort(int [] arr) {

		
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		
		}
		return arr;
	
		}
}

