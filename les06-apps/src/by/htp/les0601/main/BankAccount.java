package by.htp.les0601.main;


public class BankAccount implements Comparable<BankAccount> {

    private String name;
    private String accountNumber;
    private double moneyInTheAccount;
    private boolean isBlocked;

    public BankAccount(String name, String accountNumber, double moneyInTheAccount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.moneyInTheAccount = moneyInTheAccount;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void block() {
        this.isBlocked = true;
    }

    public double getMoneyInTheAccount() {
        return moneyInTheAccount;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMoneyInTheAccount(double moneyInTheAccount) {
        this.moneyInTheAccount = moneyInTheAccount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.moneyInTheAccount, moneyInTheAccount) == 0 &&
                isBlocked == that.isBlocked &&
                Objects.equals(name, that.name) &&
                Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountNumber, moneyInTheAccount, isBlocked);
    }
    
    @Override
    public String toString() {
        String blockedStatus = isBlocked ? " - blocked " : "";
        return String.format("%s %s %2.3f$ %s", this.name, this.getAccountNumber(), this.getMoneyInTheAccount(), blockedStatus);

    }

    public int compareTo(BankAccount bankAccount) {
        return this.accountNumber.compareTo(bankAccount.getAccountNumber());
    }

}
