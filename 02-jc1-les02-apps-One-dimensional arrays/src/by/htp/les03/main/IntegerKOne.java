package by.htp.les03.main;

import java.util.Scanner;

public class IntegerKOne {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("K");
        int K = number.nextInt();
        int sum = 0;
        int out = 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            out = array[i] % K;
            if (out == 0)
                sum = array[i] + sum;
            System.out.println(sum);
        }
    }
}