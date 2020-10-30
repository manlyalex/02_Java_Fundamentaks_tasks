package by.htp.les04.main;

import java.util.Arrays;

public class CustomerArray {
    private Customer[] array;

    public CustomerArray(Customer[] array) {
        this.array = array;
    }

    public void customerArraySorted() {
        Arrays.sort(this.array);
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < this.array.length; i++) {
            result = result + this.array[i].toString() + "\n";
        }
        return result;
    }

    public String creditCard(int from, int to) {
        String result = "";
        for (int i = 0; i < this.array.length; i++) {
            int creditCardNumber = this.array[i].getNumberCreditCard();
            if (creditCardNumber >= from && creditCardNumber <= to)
                result = result + this.array[i].getSurname() + "\n";
        }
        return result;
    }

}
