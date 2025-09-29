package bank;

public class Account {
    private int accountNo;
    private String name;
    private double balance;

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new ArithmeticException("Cannot withdraw negative amount.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(" Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
