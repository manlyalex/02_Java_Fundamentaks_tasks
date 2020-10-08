package by.htp.les02.main;

import java.util.Arrays;
import java.util.Scanner;

public class HoleEight {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the value of the two sides of the hole");
		int A = number.nextInt();
		int B = number.nextInt();
		int[] arrayAB = new int[] { A, B };
		Arrays.sort(arrayAB);
		System.out.println("Enter the value of the three sides of the brick");
		int a = number.nextInt();
		int b = number.nextInt();
		int z = number.nextInt();
		int[] arrayabz = new int[] { a, b, z };
		Arrays.sort(arrayabz);
		if (arrayAB[0] >= arrayabz[0] && arrayAB[1] >= arrayabz[1]) {
			System.out.println("The brick will pass");
		} else {
			System.out.println("The brick will not pass");
		}
	}
}