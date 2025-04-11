package Experiment6.Balance;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void Display_Balance() {
        System.out.println("Current Account Balance: $" + balance);
    }