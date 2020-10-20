package by.htp.les03.main;

import java.util.Arrays;
import java.util.Scanner;

public class CountingNumbersNine {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        int zeroNumbers = 0;
        System.out.println("Enter number N\n");
        int n = number.nextInt();
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * (25 + 1) - 10));
        }
        System.out.println((Arrays.toString(randomArray)));
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == 0)
                zeroNumbers++;

            if (randomArray[i] < 0)
                negativeNumbers++;

            if (randomArray[i] > 0)
                positiveNumbers++;

        }
        System.out.println((" Zero=" + zeroNumbers) + "\n" + (" Negative=" + negativeNumbers) + "\n" + (" Positive=" + positiveNumbers) + "\n");
    }
}
