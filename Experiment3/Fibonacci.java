package Experiment3;

/**
 * Question: Fibonacci Series Generation
 *
 * Create a Java program that generates and displays the Fibonacci series
 * up to N terms. The program should demonstrate proper input handling,
 * loop implementation, and series generation logic.
 *
 * Requirements:
 * 1. Accept user input for number of terms (N)
 * 2. Validate input:
 *    - Ensure N is positive
 *    - Handle invalid input gracefully
 * 3. Generate and display the series:
 *    - First term: 0
 *    - Second term: 1
 *    - Subsequent terms: sum of previous two terms
 * 4. Format output with proper separators
 *
 * Learning Objectives:
 * - Working with loops and conditions
 * - Handling user input with Scanner
 * - Exception handling
 * - Number series generation
 * - Basic arithmetic operations
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter the number of terms (N) for Fibonacci series: ");
        
        try {
            int n = scanner.nextInt();
            
            // Validate input
            if (n <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }
            
            System.out.println("First " + n + " terms of Fibonacci series:");
            
            long first = 0, second = 1;
            
            // Print first term
            System.out.print(first);
            
            // If N > 1, print second term
            if (n > 1) {
                System.out.print(", " + second);
            }
            
            // Print remaining terms using loop
            for (int i = 3; i <= n; i++) {
                long next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
            
            System.out.println(); // New line after series
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid positive integer.");
        } finally {
            scanner.close();
        }
    }
}