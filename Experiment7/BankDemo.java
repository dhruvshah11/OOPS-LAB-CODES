package Experiment7;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    private double balance;
    
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account account = new Account(1000);
        
        System.out.println("Initial Balance: $" + account.getBalance());
        
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); // This should fail
        account.deposit(-100); // This should fail
    }
}