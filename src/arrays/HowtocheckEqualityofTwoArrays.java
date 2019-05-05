package arrays;

import java.util.ArrayList;
import java.util.List;

public class HowtocheckEqualityofTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 2, 6, 4, 5, 6 };
		HowtocheckEqualityofTwoArrays.equalityoftwoarrays(arr1, arr2);

	}

	public static void equalityoftwoarrays(int[] a, int[] b) {
		boolean theyEqual = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					theyEqual = false;

				}
			}
		}else {
			theyEqual=false;
		}
			if (theyEqual) {
				System.out.println("They are equal");
			} else {
				System.out.println("They are not equal");
			
		}
	}

}
