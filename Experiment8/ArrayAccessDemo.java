package Experiment8;

/**
 * Question: Array Access with Exception Handling
 * 
 * Create a Java program that demonstrates array bounds checking and exception handling.
 * The program should:
 * 1. Create and initialize an array with values
 * 2. Allow user to access array elements by index
 * 3. Handle potential exceptions:
 *    - ArrayIndexOutOfBoundsException for invalid indices
 *    - Other exceptions for invalid input
 * 4. Display appropriate error messages
 * 5. Use proper resource management
 * 
 * This program demonstrates:
 * - Array manipulation and access
 * - Exception handling with try-catch blocks
 * - User input validation
 * - Scanner class usage
 * - Resource cleanup in finally block
 */

import java.util.Scanner;

public class ArrayAccessDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Initialize array with some values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10;
        }
        
        try {
            // Display array contents
            System.out.println("Array contents:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
            
            // Get index from user
            System.out.print("\nEnter an index (0-4) to access the array: ");
            int index = scanner.nextInt();
            
            // Access and display element
            System.out.println("Value at index " + index + ": " + numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index! Please enter an index between 0 and 4.");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
            
        } finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}