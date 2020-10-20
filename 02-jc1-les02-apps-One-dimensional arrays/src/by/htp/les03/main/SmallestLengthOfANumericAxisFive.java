package by.htp.les03.main;

import java.util.Arrays;

public class SmallestLengthOfANumericAxisFive {
    public static void main(String[] args) {
        int smallestLength = 0;
        int n = 10;
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 10));
        }
        System.out.println((Arrays.toString(randomArray)));
        Arrays.sort(randomArray);
        System.out.println((Arrays.toString(randomArray)));
        smallestLength = randomArray[n-1] - randomArray[0];
        System.out.println(smallestLength);
    }

}

