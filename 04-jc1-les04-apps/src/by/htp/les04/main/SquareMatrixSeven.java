package by.htp.les04.main;

import java.util.Scanner;

public class SquareMatrixSeven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("N");
        int n = number.nextInt();
        int[][] array = new int[n][n];
        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (j >= n - i) {
                    result = 0;
                } else {
                    result = i + j + 1;
                }
                array[i][j] = result;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}