package by.htp.les0501.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomersStorage {
    private Customer[] array;

    public CustomersStorage(Customer[] array) {
        this.array = array;
    }

    public void sortCustomersArray() {
        Arrays.sort(this.array);
    }

    public Customer[] getArray() {
        return this.array;
    }

    public static String toString(Customer[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i].toString() + "\n";
        }
        return result;
    }
    public Customer[] findByCreditCardInterval(int numberFrom, int numberTo) {
        List<Customer> result = new ArrayList<Customer>();
        for (int i = 0; i < this.array.length; i++) {
            int creditCardNumber = this.array[i].getNumberCreditCard();
            if (creditCardNumber >= numberFrom && creditCardNumber <= numberTo)
                result.add(this.array[i]);
        }
        Customer[] simpleArray = new Customer[ result.size() ];
        result.toArray( simpleArray );
        return simpleArray;
    }

}
