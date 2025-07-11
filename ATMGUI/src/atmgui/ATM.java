package atmgui;

public class ATM {
    private double balance = 0.0;
    private double previousTransaction = 0.0;

    public double getBalance() {
        return balance;
    }

    public double getPreviousTransaction() {
        return previousTransaction;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            previousTransaction = -amount;
            return true;
        }
        return false;
    }

    public boolean transfer(double amount) {
        return withdraw(amount);
    }
}
