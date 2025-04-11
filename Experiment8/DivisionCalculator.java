package Experiment8;

import java.util.Scanner;

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