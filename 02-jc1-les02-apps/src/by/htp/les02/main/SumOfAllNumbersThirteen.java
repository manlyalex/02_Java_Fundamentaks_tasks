package by.htp.les02.main;

import java.util.Scanner;

public class SumOfAllNumbersThirteen {

	public static void main(String[] args) {
		int rezult = 0;
		Scanner number = new Scanner(System.in);
		int myNumber = number.nextInt();
		while (myNumber <= 0) {
			while (!number.hasNextInt()) {
				System.out.print("Enter The integer number\n ");
				number.next();
			}
			System.out.print("Enter The number > 0\n ");
			myNumber = number.nextInt();
		}

		for (int i = 1; i <= myNumber; i++) {
			rezult = i + rezult;
		}
		System.out.println("Sum: " + rezult);
	}

}
