package by.htp.les0501.main;

public class ListOfCustomer {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Aliaksei", "Bamanouski", "Sergeevich",
                "Gerasimenko", 3333, 1, "223344");
        Customer customer2 = new Customer("Aliaksei", "Camanouski", "Sergeevich",
                "Gerasimenko", 1245, 2, "223344");
        Customer customer3 = new Customer("Aliaksei", "Aamanouski", "Sergeevich",
                "Gerasimenko", 5001, 2, "223344");

        // customer1.setSurname("Eleksei");

        Customer[] array = {customer1, customer2, customer3};

        CustomersStorage customersStorage = new CustomersStorage(array);

        System.out.println(CustomersStorage.toString(customersStorage.getArray()));
        customersStorage.sortCustomersArray();
        System.out.println(CustomersStorage.toString(customersStorage.getArray()));

        Customer[] foundCustomers = customersStorage.findByCreditCardInterval(1000,5000);
        System.out.println(CustomersStorage.toString(foundCustomers ));
    }

}
