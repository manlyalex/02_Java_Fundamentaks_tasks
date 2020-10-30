package by.htp.les04.main;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aliaksei", "Bamanouski", "Sergeevich",
                "Gerasimenko", 3333, 1, "223344");
        Customer customer2 = new Customer("Aliaksei", "Camanouski", "Sergeevich",
                "Gerasimenko", 1245, 2, "223344");
        Customer customer3 = new Customer("Aliaksei", "Aamanouski", "Sergeevich",
                "Gerasimenko", 5000, 2, "223344");

       // customer1.setSurname("Eleksei");

        Customer[] array = {customer1, customer2, customer3};

        CustomerArray customerArray = new CustomerArray(array);
        System.out.println(customerArray.toString());
        customerArray.customerArraySorted();
        System.out.println(customerArray.toString());
        System.out.println(customerArray.creditCard(1000,5000));
    }

}
