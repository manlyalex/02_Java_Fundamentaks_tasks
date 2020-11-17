package by.htp.les0501.main;

public class Customer implements Comparable<Customer> {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int numberCreditCard;
    private String bankAccountNumber;

    public Customer(String name, String surname, String patronymic, String address, int numberCreditCard, int id, String bankAccountNumber) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.id = id;
        this.bankAccountNumber = bankAccountNumber;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname.toUpperCase();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCreditCard() {
        return this.numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s: %s", this.getSurname(), this.getName(), this.getPatronymic(), this.getAddress());
    }

    public int compareTo(Customer customer) {
        return this.surname.compareTo(customer.getSurname());


    }
}

