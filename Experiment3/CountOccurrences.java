package Experiment3;

import java.util.Scanner;

/**
 * Question: Write a Java program to count the occurrences of a specific number in an array.
 * 
 * Problem Statement:
 * - Create a program that counts how many times a user-specified number appears in a predefined array
 * - The program should have a fixed array of integers
 * - User should be able to input a target number to search for
 * - Program must display both the array contents and the count of occurrences
 * 
 * Example:
 * If array is [2, 3, 2, 5, 2, 6] and user inputs 2
 * Output should show that 2 appears 3 times in the array
 */
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize array
        int[] arr = {2, 3, 2, 5, 2, 6};
        
        // Get target number from user
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        
        // Count occurrences
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        // Display result
        System.out.println("\nArray elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber " + target + " appears " + count + " times in the array.");
        
        // Close scanner
        scanner.close();
    }
}