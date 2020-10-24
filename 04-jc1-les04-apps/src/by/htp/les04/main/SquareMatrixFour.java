package by.htp.les04.main;

import java.util.Scanner;

public class SquareMatrixFour {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("N");
        int n = number.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            boolean oddNumber = (i % 2 != 0);

            for (int j = 0; j < n; j++) {
                int result = oddNumber ? n - j : j + 1;
                array[i][j] = result;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
