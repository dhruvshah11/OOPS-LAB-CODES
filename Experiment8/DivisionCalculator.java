package Experiment8;

import java.util.Scanner;

/**
 * Question: Implement a Division Calculator with Exception Handling
 * 
 * Create a Java program that performs division of two numbers with proper exception handling.
 * The program should:
 * 1. Accept two numbers from the user (numerator and denominator)
 * 2. Handle potential exceptions:
 *    - ArithmeticException for division by zero
 *    - Other exceptions for invalid input
 * 3. Display the result of division if successful
 * 4. Show appropriate error messages for exceptions
 * 5. Demonstrate proper resource management using finally block
 * 
 * This program demonstrates:
 * - Exception handling using try-catch blocks
 * - Multiple catch blocks for different exceptions
 * - Using Scanner class for user input
 * - Proper resource cleanup in finally block
 * - Basic arithmetic operations and error checking
 */
public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get input from user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            // Perform division
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
            
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}