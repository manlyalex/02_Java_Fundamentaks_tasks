package by.htp.les03.main;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberTen {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number N:\n");
        int n = number.nextInt();
        int index = 0;
        int[] resultArray = new int[n / 2];
        int[] randomArray = new int[n];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println((Arrays.toString(randomArray)));
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[index++] = randomArray[i] + randomArray[n - 1 - i];
        }
        System.out.println((Arrays.toString(resultArray)));
        int maxNumber = resultArray[0];
        int minNumber = resultArray[0];
        for (int i = 1; i < resultArray.length; i++) {
            if (resultArray[i] > maxNumber)
                maxNumber = resultArray[i];

            if (resultArray[i] < minNumber)
                minNumber = resultArray[i];
        }
        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);
    }
}

