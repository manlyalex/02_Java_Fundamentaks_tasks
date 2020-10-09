package by.htp.les02.main;

import java.util.Scanner;

public class SumOfAllNumbersThirteen {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int rezult = 0;
		boolean Check;
		int myNumber;
		while (true) {
			System.out.print("Enter The integer number\n ");
			Check = number.hasNextInt();
			if (!Check) {
				number.next();
				continue;
			}
			myNumber = number.nextInt();
			if (myNumber <= 0) {
				continue;
			}
			break;
		}
		for (int i = 1; i <= myNumber; i++) {
			rezult = i + rezult;
		}
		System.out.println("Sum: " + rezult);
	}

}
