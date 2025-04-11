/**
 * Program to find the area of a triangle
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