/**
 * Program to determine the greatest among three integers
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