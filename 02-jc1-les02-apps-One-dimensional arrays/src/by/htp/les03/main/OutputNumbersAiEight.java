package by.htp.les03.main;

import java.util.Arrays;

public class OutputNumbersAiEight {
    public static void main(String[] args) {
        int index = 0;
        int n = 10;
        int[] randomArray = new int[n];
        int[] searchResultArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 10));
        }
        System.out.println((Arrays.toString(randomArray)));
        System.out.print("[");
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > i) {
                searchResultArray[index] = randomArray[i];
                System.out.print(searchResultArray[index] + ", ");
                index++;
            } else {
                System.out.print("   ");
            }
        }
        System.out.print("]");
    }
}