package by.htp.les04.main;

import java.util.Scanner;

public class MatrixOnesAndZerosTwelve {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("M");
        int m = number.nextInt();
        System.out.println("N");
        int n = number.nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                array[i][j] = i < j ? 1 : 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
