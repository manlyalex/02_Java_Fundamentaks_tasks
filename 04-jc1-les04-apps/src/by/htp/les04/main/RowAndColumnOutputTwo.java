package by.htp.les04.main;

import java.util.Scanner;

public class RowAndColumnOutputTwo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("K");
        int k = number.nextInt();
        System.out.println("P");
        int p = number.nextInt();
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = k; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }

        for (int j = p; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
