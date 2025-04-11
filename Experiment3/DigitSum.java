package Experiment3;

/**
 * Program to calculate the sum of digits in an integer using while loop
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