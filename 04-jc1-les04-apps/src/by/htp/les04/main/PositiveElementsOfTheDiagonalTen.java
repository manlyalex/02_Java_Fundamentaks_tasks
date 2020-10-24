package by.htp.les04.main;

public class PositiveElementsOfTheDiagonalTen {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * (100) - 50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.println(array[i][i]);
            }
        }
    }
}


