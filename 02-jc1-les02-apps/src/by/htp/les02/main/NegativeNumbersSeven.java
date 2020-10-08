package by.htp.les02.main;

import java.util.Scanner;

public class NegativeNumbersSeven {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		int b = number.nextInt();
		int c = number.nextInt();
		System.out.println("Number of positive numbers: " + ((a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0)));
		System.out.println("Number of negative numbers: " + ((a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0)));
	}

}