/**
 * Question: Number Classification Program
 *
 * Write a Java program that takes a number as input and classifies it as positive,
 * negative, or zero. The program should demonstrate the use of conditional statements
 * for number classification.
 *
 * Requirements:
 * 1. Accept a number input from the user
 * 2. Classify the number as:
 *    - Positive (greater than 0)
 *    - Negative (less than 0)
 *    - Zero (equal to 0)
 * 3. Display appropriate message based on classification
 *
 * Learning Objectives:
 * - Implementation of if-else statements
 * - Working with Scanner class for input
 * - Basic number comparison operations
 * - Proper input handling and output formatting
 */
import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close scanner
        scanner.close();
    }
}