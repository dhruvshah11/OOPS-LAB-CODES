/**
 * Question: Days Calculator Since Unix Epoch
 *
 * Write a Java program that calculates the number of days between a given date
 * and January 1, 1970 (Unix epoch). The program should demonstrate the use of
 * Java's date/time API and command-line argument handling.
 *
 * Requirements:
 * 1. Accept date input as command-line arguments in format: DD MM YYYY
 * 2. Validate input format and date validity
 * 3. Calculate days between input date and Unix epoch (01/01/1970)
 * 4. Handle invalid inputs and edge cases appropriately
 *
 * Learning Objectives:
 * - Working with Java's LocalDate class
 * - Command-line argument parsing and validation
 * - Date calculations using ChronoUnit
 * - Exception handling for invalid inputs
 * - Proper date formatting and display
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysSince1970 {
    public static void main(String[] args) {
        // Check if correct number of arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide date in format: DD MM YYYY");
            System.out.println("Example: java DaysSince1970 04 08 2021");
            return;
        }

        try {
            // Parse command line arguments
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            // Create LocalDate objects
            LocalDate inputDate = LocalDate.of(year, month, day);
            LocalDate epochDate = LocalDate.of(1970, 1, 1);

            // Calculate days between dates
            long daysSinceEpoch = ChronoUnit.DAYS.between(epochDate, inputDate);

            // Display result
            System.out.printf("Number of days between %02d/%02d/%04d and 01/01/1970: %d\n", 
                            day, month, year, daysSinceEpoch);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for date.");
        } catch (Exception e) {
            System.out.println("Error: Invalid date. Please ensure the date is valid.");
        }
    }
}