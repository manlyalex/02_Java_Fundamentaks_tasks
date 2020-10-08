package by.htp.les02.main;

import java.util.Scanner;

public class TriangleSix {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int firstAngle = number.nextInt();
		int secondAngle = number.nextInt();
		int sumOfAngles = 180;
		if (firstAngle + secondAngle > sumOfAngles) {
			System.out.print("No such triangle exists");
		} else {
			System.out.print("Triangle exists\n");
			if (sumOfAngles - (firstAngle + secondAngle) == 90 || firstAngle == 90 || secondAngle == 90) {
				System.out.print("It is rectangular ");
			}
		}
	}
}