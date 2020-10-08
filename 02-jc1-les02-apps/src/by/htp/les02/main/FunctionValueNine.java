package by.htp.les02.main;

import java.util.Scanner;

public class FunctionValueNine {

	public static void main(String[] args) {
		Scanner function = new Scanner(System.in);
		double x = function.nextDouble();
		if (x <= 3) {
			double numberOut = x * x - (3 * x) + 9;
			System.out.println("F(x) = " + numberOut);
		} else if (x > 3) {
			double numberOut = (double) (1 / (Math.pow(x, 3) + 6));
			System.out.println("F(x) = " + numberOut);
		}
	}

}