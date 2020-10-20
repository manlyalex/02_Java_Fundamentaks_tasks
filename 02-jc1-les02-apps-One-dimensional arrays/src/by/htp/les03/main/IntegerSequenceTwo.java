package by.htp.les03.main;

import java.util.Arrays;

public class IntegerSequenceTwo {
    public static void main(String[] args) {
        int index = 0;
        int n = 10;
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 3));
        }
        System.out.println((Arrays.toString(randomArray)));
        int[] searchResultArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {

            if (randomArray[i] == 0) {
                searchResultArray[index] = i;
                index++;
            }
        }
        System.out.println((Arrays.toString(searchResultArray)));
    }
}