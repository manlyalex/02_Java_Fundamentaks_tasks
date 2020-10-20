package by.htp.les03.main;

public class AscendingSequenceOfNumbersThree {
    public static void main(String[] args) {
        int mas[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < mas[i + 1]) {
                System.out.println("This array growing up");
                break;
            } else {
                System.out.println("This array not growing up");
                break;
            }
        }
    }
}
