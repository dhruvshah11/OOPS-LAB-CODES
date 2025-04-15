/**
 * Question: Simple Interest Calculator with User Input
 *
 * Create a Java program that calculates Simple Interest based on user input
 * for principal amount, rate of interest, and time period. The program should
 * demonstrate proper use of Scanner class and floating-point calculations.
 *
 * Requirements:
 * 1. Accept user input for:
 *    - Principal amount
 *    - Rate of interest (in percentage)
 *    - Time period (in years)
 * 2. Calculate Simple Interest using the formula: (P * R * T) / 100
 * 3. Display all input values and the calculated result
 * 4. Format output for better readability
 *
 * Learning Objectives:
 * - Working with Scanner class
 * - Floating-point calculations
 * - Basic input/output operations
 * - Variable declaration and initialization
 * - Proper code formatting and documentation
 */
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.println("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.println("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display result
        System.out.println("\nSimple Interest Details:");
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        
        // Close scanner
        scanner.close();
    }
}