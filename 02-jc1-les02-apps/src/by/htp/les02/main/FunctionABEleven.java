package by.htp.les02.main;

import java.util.Scanner;

public class FunctionABEleven {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number À");
		int A = number.nextInt();
		System.out.println("Enter the number B");
		int B = number.nextInt();
		System.out.println("Enter the number h");
		int h = number.nextInt();
		for (int x = A; x <= B; x = x + h) {
			if (x > 2)
				System.out.println(x);
			else
				System.out.println(-x);

		}
	}

}