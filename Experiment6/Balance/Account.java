package Balance;

/**
 * Question: Package Creation and Access Control in Java
 *
 * Create a Java program that demonstrates the creation and usage of packages
 * along with proper access control mechanisms. Implement a banking account
 * system where account details are encapsulated within a package.
 *
 * Requirements:
 * 1. Create a package named 'Balance' to contain account-related classes
 * 2. Implement Account class with:
 *    - Private balance field for data hiding
 *    - Public constructor for initialization
 *    - Public method to display balance
 * 3. Demonstrate:
 *    - Package creation and organization
 *    - Access modifiers usage
 *    - Encapsulation principles
 *
 * Learning Objectives:
 * - Understanding package creation
 * - Implementing access control
 * - Applying encapsulation
 * - Managing class visibility
 */

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void Display_Balance() {
        System.out.println("Current Account Balance: $" + balance);
    }
}