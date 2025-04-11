package Experiment6;

import Balance.Account;

public class TestBalance {
    public static void main(String[] args) {
        // Create an account with initial balance
        Account account = new Account(1000.0);
        
        // Display the account balance
        System.out.println("Testing Balance Package:");
        account.Display_Balance();
    }
}