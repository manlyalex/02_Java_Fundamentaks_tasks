package by.htp.les02.main;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class ExpressionByFormulaOne {

	public static void main(String[] args) {
		double rezult;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number À");
		double a = number.nextDouble();
		while (a == 0) {
			System.out.println("a = 0\nDivision by zero. Enter the number À\n");
			a = number.nextDouble();
		}
		System.out.println("Enter the number B");
		double b = number.nextDouble();
		System.out.println("Enter the number C");
		double c = number.nextDouble();
		System.out.println(rezult = b + ((sqrt(pow(b, 2) + (4 * a * c))) / (2 * a)) - (pow(a, 3) * c) + pow(b, -2));

	}

}