package arrays;

public class HowtofindDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6,3, 4, 1, 5, 6, 2 };
		HowtofindDuplicatesInArray.returnDuplicates(arr);
		

	}

	public static int returnDuplicates(int[] ar) {
		int res=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j]) {
					res=ar[i];
					System.out.println(res);
				}
			}
		}
		return res;
	}

}
