package by.htp.les04.main;

import java.util.Scanner;

public class MatrixMxNThree {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("M");
        int m = number.nextInt();
        System.out.println("N");
        int n = number.nextInt();
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < m; i++) {
            boolean evenNumber = (i % 2 == 0);
            System.out.println("");
            for (int j = 0; j < n; j++) {
                int resultJ = evenNumber ? n - 1 - j : j;
                System.out.print(array[i][resultJ]+ " ");
            }
        }
    }
}

