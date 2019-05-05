package com.java;

import java.util.Arrays;

public class FindMiddleArray {
	public static void main(String[] args) {
		int[] arr = { 2, 45, 1, 67,111,134,89, 4, 9, 23 };
		int temp = 0;
		for(int j=0;j<arr.length-1;j++) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length/2);
	}
}