package by.htp.les03.main;

import java.util.Arrays;
import java.util.Scanner;

public class ReplacingNumbersSix {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a value between 0 and 10\n");
        int count = 0;
        int Z = number.nextInt();
        int n = 10;
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 10));
        }
        System.out.println((Arrays.toString(randomArray)));
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > Z) {
                randomArray[i] = Z;
                count++;
            }
        }
        System.out.println((Arrays.toString(randomArray)));


        System.out.print("Number of replacements: " + count);
    }

}