package by.htp.les03.main;

import java.util.Arrays;

public class LargestAndSmallestElementsSeven {
    public static void main(String[] args) {
        int maxNumberFor = 0;
        int minNumberFor = 0;
        int n = 10;
        int[] randomArray = new int[n];
        int maxNumber = randomArray[0];
        int minNumber = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 10));
        }
        System.out.println(Arrays.toString(randomArray));
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > maxNumber) {
                maxNumber = randomArray[i];
                maxNumberFor = i;
            }
            if (randomArray[i] < minNumber) {
                minNumber = randomArray[i];
                minNumberFor = i;
            }
        }
        randomArray[minNumberFor] = maxNumber;
        randomArray[maxNumberFor] = minNumber;
        System.out.println(Arrays.toString(randomArray));
    }
}
