package by.htp.les02.main;

import java.util.Scanner;

public class GcdFiveteen {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int firstNumber = number.nextInt();
		int secondNumber = number.nextInt();
		int resultNumber = 0;
		int resultInFor = 0;
		while (firstNumber != 0 && secondNumber != 0) {
			if (firstNumber > secondNumber)
				firstNumber = firstNumber % secondNumber;
			else
				secondNumber = secondNumber % firstNumber;
		}
		System.out.println("GCD = " + (firstNumber + secondNumber));
	}
}
