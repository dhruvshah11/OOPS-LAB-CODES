package Experiment10;

/**
 * Problem Statement:
 * Write a Java program that demonstrates the use of ArrayList and HashSet to:
 * 1. Create an ArrayList with duplicate integer values
 * 2. Convert the ArrayList to HashSet to remove duplicates
 * 3. Calculate and display the sum of unique values
 *
 * Requirements:
 * - Use ArrayList to store initial numbers with duplicates
 * - Use HashSet to eliminate duplicate values
 * - Demonstrate the difference between original and unique values
 * - Calculate sum of unique values using enhanced for loop
 *
 * Expected Output:
 * - Display original ArrayList with duplicates
 * - Show unique values after conversion to HashSet
 * - Print the sum of unique values
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class UniqueSum {
    public static void main(String[] args) {
        // Create ArrayList with duplicate values
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));

        // Print original list
        System.out.println("Original ArrayList: " + numbers);

        // Convert to HashSet to get unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Unique values: " + uniqueNumbers);

        // Calculate sum of unique values
        int sum = 0;
        for (Integer num : uniqueNumbers) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of unique values: " + sum);
    }
}