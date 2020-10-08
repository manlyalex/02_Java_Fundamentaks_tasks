package by.htp.les02.main;

import java.util.Scanner;

public class FactorialOfNumberFourteen {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int myNumber = number.nextInt();
		int factorial = 1;
		for (int i = 1; i <= myNumber; i++) {
			factorial = factorial * i;

		}
		System.out.print(factorial);
	}

}
