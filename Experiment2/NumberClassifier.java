/**
 * Program to check whether a given number is positive, negative, or zero using if-else statement
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