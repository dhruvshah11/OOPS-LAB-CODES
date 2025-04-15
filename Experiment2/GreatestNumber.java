/**
 * Question: Finding the Greatest Among Three Numbers
 *
 * Write a Java program that finds the greatest number among three integers input
 * by the user. The program should demonstrate the use of conditional statements
 * and comparison operators.
 *
 * Requirements:
 * 1. Accept three integer inputs from the user
 * 2. Compare the numbers using appropriate conditional statements
 * 3. Display the greatest number among the three
 *
 * Learning Objectives:
 * - Implementation of if statements for comparison
 * - Working with Scanner class for multiple inputs
 * - Basic number comparison logic
 * - Proper variable initialization and updating
 */
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter three numbers:");
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Third number: ");
        int num3 = scanner.nextInt();
        
        // Find the greatest number
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        
        if (num3 > greatest) {
            greatest = num3;
        }
        
        // Display result
        System.out.println("\nThe greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
        
        // Close scanner
        scanner.close();
    }
}