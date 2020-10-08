package by.htp.les02.main;

import java.util.Scanner;

public class ExpressionByFormulaTwo {

	public static void main(String[] args) {
		double result;
		Scanner function = new Scanner(System.in);
		System.out.print("Enter the number a ");
		double a = function.nextDouble();
		System.out.print("Enter the number b ");
		double b = function.nextDouble();
		System.out.print("Enter the number c ");
		double c = function.nextDouble();
		while (c == 0) {
			System.out.print("ñ = 0\nDivision by zero\n");
			System.out.print("Enter the number c\n");
			c = function.nextDouble();
		}

		System.out.print("Enter the number d ");
		double d = function.nextDouble();
		while (d == 0) {
			System.out.print("d = 0\nDivision by zero\n");
			System.out.print("Enter the number d\n");
			d = function.nextDouble();
		}

		System.out.print("result = " + (result = ((a / c) * (b / d)) - ((a * b - c) / (c * d))));
	}

}