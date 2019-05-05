package practice;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want to be in your Pyramid");
		int numOfRows = sc.nextInt();

		int rowCount = 1;
		System.out.println("Your Pyramid started");

		for (int i = numOfRows; i > 1; i--) {

			for (int j = 1; j < i; j++) {
				System.out.print("*");

			}

			for (int k = 1; k <= rowCount; k++) {
				System.out.print(rowCount + " ");

			}
			System.out.println("*");

			rowCount++;
		}

	}
}
