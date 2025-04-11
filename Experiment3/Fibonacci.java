package Experiment3;

/**
 * Program to print first N terms of Fibonacci series using loop
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