package arrays;

public class FindallpairsofElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = { 12, 5, 7, 15, 8, 8, 13, 9, 3 };
		FindallpairsofElementsInArray.findsumofArrays(arr1);

	}

	public static void findsumofArrays(int[] arr) {
		int num = 20;
		boolean sumisEqual = false;
		for (int i = 0; i < arr.length; i++) {
			int res = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					sumisEqual = true;
					res = arr[j];
					break;
				} else {
					sumisEqual = false;
				}
			}
			if (sumisEqual) {
				System.out.println("These are the numbers: " + arr[i] + "+" + res + " whose sum is equal to " + num);
			} else {
				// System.out.println("There are no values whose sum is equal to: " + num);
			}
		}
	}
}
