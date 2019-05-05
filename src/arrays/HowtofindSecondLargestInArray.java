package arrays;

import java.util.Arrays;

public class HowtofindSecondLargestInArray {

	public static void main(String[] args) {
		int[] arr1 = { 23, 99, 43, 45, 1, 111, 77, 31 };
		HowtofindSecondLargestInArray.getSecondlArgestArray(arr1);

	}

	public static int[] getSecondlArgestArray(int arr[]) {
		int temp = 0;
		for (int j = 0; j < arr.length - 1; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			}
		}
		System.out.println(arr[arr.length - 2]);
		return arr;
	}

}
