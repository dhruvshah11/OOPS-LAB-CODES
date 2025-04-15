package Experiment7;

/**
 * Question: Bank Account Interface Implementation
 *
 * Create a Java program that implements a banking system using interfaces.
 * The program should demonstrate interface implementation, encapsulation,
 * and basic banking operations.
 *
 * Requirements:
 * 1. Create a Bank interface with methods:
 *    - deposit(double amount)
 *    - withdraw(double amount)
 * 2. Implement Account class with:
 *    - Balance tracking
 *    - Transaction validation
 *    - Proper error handling
 * 3. Demonstrate usage with:
 *    - Account creation
 *    - Multiple transactions
 *    - Invalid operation handling
 *
 * Learning Objectives:
 * - Understanding interfaces
 * - Implementing interface methods
 * - Encapsulation principles
 * - Transaction validation
 * - Error handling
 */

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