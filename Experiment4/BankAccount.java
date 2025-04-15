package Experiment4;

/**
 * Question: Bank Account System with Access Modifiers
 *
 * Create a Java program that implements a basic banking system to demonstrate
 * the use of different access modifiers and encapsulation principles.
 *
 * Requirements:
 * 1. Implement BankAccount class with:
 *    - Private balance variable for data hiding
 *    - Public method for deposits
 *    - Protected method for withdrawals
 *    - Default access method for balance checking
 * 2. Demonstrate:
 *    - Proper encapsulation of account balance
 *    - Transaction validation
 *    - Access level restrictions
 *
 * Learning Objectives:
 * - Understanding access modifiers (public, private, protected, default)
 * - Implementing encapsulation
 * - Basic transaction validation
 * - Class member organization
 * - Error handling for invalid operations
 */
public class BankAccount {
    private double balance; // Private variable
    
    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }
    
    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
    
    // Default access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Test public method
        account.deposit(1000);
        
        // Test protected method
        account.withdraw(500);
        
        // Test default access method
        account.checkBalance();
        
        // Try to access private variable (will not work)
        // System.out.println(account.balance); // This would cause compilation error
    }
}