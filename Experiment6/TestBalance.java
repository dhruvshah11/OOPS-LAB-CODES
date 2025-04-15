// Package declaration removed as file is in default package

import Balance.Account;

/**
 * Question: Package Testing and Import Demonstration
 *
 * Create a Java program that demonstrates how to test and use classes from a custom package.
 * Show the proper way to import and utilize package members while maintaining encapsulation.
 *
 * Requirements:
 * 1. Import the Account class from the Balance package
 * 2. Create an instance of Account with initial balance
 * 3. Test the accessibility of Account methods
 * 4. Demonstrate:
 *    - Package importing syntax
 *    - Object instantiation from imported class
 *    - Access control across packages
 *
 * Learning Objectives:
 * - Understanding package imports
 * - Working with custom packages
 * - Cross-package object instantiation
 * - Access control verification
 */

public class TestBalance {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account account = new Account(1000.0);
        
        // Display the account balance
        System.out.println("Testing Balance Package:");
        account.Display_Balance();
    }
}