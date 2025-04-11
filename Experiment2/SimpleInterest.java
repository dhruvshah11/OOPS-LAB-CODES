/**
 * Program to calculate Simple Interest
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