package by.htp.les04.main;

public class MatrixTenByFifteenEleven {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int targetNumber = 5;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 16);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }


        for (int i = 0; i < n; i++) {
            int countInTheRow = 0;

            for (int j = 0; j < m; j++) {
                if (array[i][j] == targetNumber) {
                    countInTheRow++;
                }
            }

            if (countInTheRow >= 3) {
                System.out.println(i+1);
            }
        }
    }
}
