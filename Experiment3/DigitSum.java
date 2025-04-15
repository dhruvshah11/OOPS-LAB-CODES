package Experiment3;

/**
 * Question: Write a Java program to calculate the sum of digits in an integer.
 *
 * Problem Statement:
 * - Create a program that calculates the sum of all digits in a given integer
 * - Program should handle both positive and negative numbers
 * - Use a while loop for digit extraction
 * - Display both the original number and the sum of its digits
 *
 * Example:
 * Input: 12345
 * Output: Sum of digits in 12345: 15 (1+2+3+4+5)
 *
 * Learning Objectives:
 * - Working with loops
 * - Basic arithmetic operations
 * - Number manipulation
 * - Input validation
 */
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter an integer: ");
        
        try {
            int number = scanner.nextInt();
            int originalNumber = number;
            int sum = 0;
            
            // Take absolute value for negative numbers
            number = Math.abs(number);
            
            // Calculate sum of digits using while loop
            while (number > 0) {
                sum += number % 10;  // Add last digit to sum
                number /= 10;        // Remove last digit
            }
            
            // Display result
            System.out.printf("Sum of digits in %d: %d\n", originalNumber, sum);
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}