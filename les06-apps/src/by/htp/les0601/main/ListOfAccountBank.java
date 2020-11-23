package by.htp.les0601.main;

import java.util.ArrayList;
import java.util.List;

public class ListOfAccountBank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Aliaksei", "777777", -25.344);
        BankAccount bankAccount2 = new BankAccount("Aliaksei", "555555", 55.123);
        BankAccount bankAccount5 = new BankAccount("Aliaksei", "555554", -5.052);
        BankAccount bankAccount3 = new BankAccount("Olga", "499999", 50.001);
        BankAccount bankAccount4 = new BankAccount("Olga", "699999", 3.033);

        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);
        bankAccounts.add(bankAccount4);
        bankAccounts.add(bankAccount5);
        BankAccountStorage bankAccountStorage = new BankAccountStorage(bankAccounts);

        System.out.println(BankAccountStorage.toString(bankAccountStorage.getBankAccounts()));
        bankAccountStorage.sortBankAccounts();
        System.out.println(BankAccountStorage.toString(bankAccountStorage.getBankAccounts()));


        List<BankAccount> filteredByName = BankAccountStorage.filterByName("Aliaksei", bankAccounts);
        System.out.println(BankAccountStorage.toString(filteredByName));

        bankAccountStorage.blockAccount("555555");
        System.out.println(BankAccountStorage.toString(bankAccounts));

        System.out.println(bankAccountStorage.findAccountByNumber("555555"));


        System.out.println(bankAccountStorage.summaryAccountByNumber(bankAccountStorage));

        System.out.println(bankAccountStorage.summaryAccountByNumberPositive(bankAccountStorage));

        System.out.println(bankAccountStorage.summaryAccountByNumberNegative(bankAccountStorage));
    }
}
