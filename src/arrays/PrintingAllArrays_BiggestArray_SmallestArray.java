package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintingAllArrays_BiggestArray_SmallestArray {

	public static void main(String[] args) {
		int arr[]= {23,451,67,7,89,89,90};
		
		Arrays.sort(arr);
		System.out.println("Printing all Arrays "+Arrays.toString(arr));
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			
			
			sum+=sum=arr[i];			
				
			
			
		}
		System.out.println("This is the sum of Arrays "+sum);
		
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("This is biggest Array "+max);
		
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("This is smallest Array "+min);
	}
}
