package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniquesInArray {
	
	public static void main(String[] args) {
		int[] printUniqueArrays= {2,2,2,2,4,4,4,5,66,7,9,3};
		removeDuplicates(printUniqueArrays);
	}
	
	public static void removeDuplicates(int[] arr) {
		   
	for(int i=0; i<arr.length;i++) {
		boolean flag=false;
		for(int j=0; j<i;j++) {
			if(arr[i]==arr[j]) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.print(arr[i]+ ",");
		}
	}

}
}