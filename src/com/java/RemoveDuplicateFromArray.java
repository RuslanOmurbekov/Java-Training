package com.java;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int[] arr= {2,2,2,2,2,2,3,7,4,2,1,6,7,3};
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag=false;
			for (int j =0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(arr[i]+"-");
			}
		}

	}

}
