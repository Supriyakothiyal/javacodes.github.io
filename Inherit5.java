// BankAccount.java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        // Implemented in subclasses
    }

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount.java
public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100.0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(200.0);
        System.out.println("Balance: " + savingsAccount.getBalance()); // Output: Balance: 200.0
        savingsAccount.withdraw(50.0);
        System.out.println("Balance: " + savingsAccount.getBalance()); // Output: Balance: 150.0
        savingsAccount.withdraw(100.0); // Output: Withdrawal not allowed. Minimum balance should be maintained.
    }
}
