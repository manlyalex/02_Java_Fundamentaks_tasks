package by.htp.les0601.main;

import java.util.*;
import java.util.function.Function;

public class BankAccountStorage {
    private List<BankAccount> bankAccounts;

    public BankAccountStorage(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        return this.bankAccounts;
    }

    public void sortBankAccounts() {
        Collections.sort(this.bankAccounts);
    }

    public static String toString(List<BankAccount> bankAccounts) {
        String result = "";
        for (BankAccount bankAccount : bankAccounts) {
            result += bankAccount + "\n";
        }
        return result;
    }

    public static List<BankAccount> filterByField(Function<BankAccount, String> func, String value, List<BankAccount> bankAccounts) {
        List<BankAccount> result = new ArrayList<BankAccount>();
        for (BankAccount bankAccount : bankAccounts) {
            if (func.apply(bankAccount).equals(value)) {
                result.add(bankAccount);
            }
        }
        return result;
    }

    public static List<BankAccount> filterByName(String value, List<BankAccount> bankAccounts) {
        Function<BankAccount, String> getBankName = e -> e.getName();
        return BankAccountStorage.filterByField(getBankName, value, bankAccounts);
    }

    public void blockAccount(String accountNumber) {
        BankAccount account = this.findAccountByNumber(accountNumber);
        if (account != null) {
            account.block();
        }
    }

    public BankAccount findAccountByNumber(String accountNumber) {
        BankAccount result = null;
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber) {
                result = bankAccount;
                break;
            }
        }
        return result;
    }

    public double summaryAccountByNumber(BankAccountStorage moneyInTheAccount) {
        double result = 0;
        for (BankAccount bankAccount : this.bankAccounts) {
            result += bankAccount.getMoneyInTheAccount();
        }
        return result;
    }

    public double summaryAccountByNumberPositive(BankAccountStorage moneyInTheAccount) {
        double negative = 0;
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getMoneyInTheAccount() < 0) {
                negative += bankAccount.getMoneyInTheAccount();
            }

        }
        return negative;
    }

    public double summaryAccountByNumberNegative(BankAccountStorage moneyInTheAccount) {
        double positive = 0;
        for (BankAccount bankAccount : this.bankAccounts) {
            if (bankAccount.getMoneyInTheAccount() >= 0) {
                positive += bankAccount.getMoneyInTheAccount();
            }

        }
        return positive;
    }


}

