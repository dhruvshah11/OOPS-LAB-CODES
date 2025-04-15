/**
 * Program to find the area of a triangle using base and height
 *
 * Problem Statement:
 * Write a Java program that calculates the area of a triangle by taking the base and height
 * as input from the user. The program should use the formula: Area = (1/2) × base × height
 *
 * Key Concepts:
 * - User input handling using Scanner class
 * - Basic arithmetic operations
 * - Type conversion and calculations
 * - Proper resource management (closing Scanner)
 *
 * Expected Input:
 * - Base length of the triangle (double)
 * - Height of the triangle (double)
 *
 * Expected Output:
 * - Area of the triangle (double)
 */
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        // Calculate area
        double area = 0.5 * base * height;
        
        // Display result
        System.out.println("The area of the triangle is: " + area);
        
        // Close scanner
        scanner.close();
    }
}