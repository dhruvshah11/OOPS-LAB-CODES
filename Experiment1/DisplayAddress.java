/**
 * Question: Multi-line Text Output with Address Information
 *
 * Write a Java program that displays a person's complete address information
 * using different output techniques. The program should demonstrate proper
 * use of System.out.println() and escape sequences.
 *
 * Requirements:
 * 1. Display the following address components on separate lines:
 *    - Name
 *    - Address Line 1
 *    - Address Line 2
 *    - City
 *    - State
 *    - Pin Code
 *    - Country
 * 2. Implement two different output methods:
 *    - Using multiple println statements
 *    - Using a single println with escape sequences
 *
 * Learning Objectives:
 * - Understanding console output methods
 * - Working with String literals
 * - Using escape sequences (\n)
 * - Formatting text output
 * - String concatenation
 */
public class DisplayAddress {
    public static void main(String[] args) {
        // Display name and address on different lines
        System.out.println("Name: Aman Sharma");
        System.out.println("Address Line 1: 42 Rajendra Nagar");
        System.out.println("Address Line 2: Sector 12");
        System.out.println("City: New Delhi");
        System.out.println("State: Delhi");
        System.out.println("Pin: 110001");
        System.out.println("Country: India");
        
        // Alternative method using a single println with escape sequences
        System.out.println("\nAlternative display using escape sequences:\n" +
                           "Name: Aman Sharma\n" +
                           "Address Line 1: 42 Rajendra Nagar\n" +
                           "Address Line 2: Sector 12\n" +
                           "City: New Delhi\n" +
                           "State: Delhi\n" +
                           "Pin: 110001\n" +
                           "Country: India");
    }
}