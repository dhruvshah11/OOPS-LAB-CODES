/**
 * Question: Day of Week Converter using Switch Statement
 *
 * Write a Java program that accepts a number (1-7) as input and displays
 * the corresponding day of the week. The program should demonstrate the
 * use of switch statement for multiple condition handling.
 *
 * Requirements:
 * 1. Accept a number input from the user (1-7)
 * 2. Use switch statement to convert number to day name
 * 3. Display appropriate error message for invalid inputs
 * 4. Implement proper input validation
 *
 * Learning Objectives:
 * - Understanding switch statement syntax and usage
 * - Working with Scanner class for user input
 * - Implementing input validation
 * - String variable assignment
 * - Basic control flow
 */
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter a number (1-7) to display the day of week:");
        int dayNumber = scanner.nextInt();
        
        String day;
        
        // Determine the day using switch statement
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day number! Please enter a number between 1 and 7.";
        }
        
        // Display result
        System.out.println("Day: " + day);
        
        // Close scanner
        scanner.close();
    }
}