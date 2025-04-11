/**
 * Program to display the day of the week based on a number input
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