package Experiment10;

/**
 * Problem Statement:
 * Write a Java program that demonstrates the use of HashSet to remove duplicate names from an array.
 * The program should:
 * 1. Create an array of strings containing duplicate names
 * 2. Use HashSet to eliminate duplicate entries
 * 3. Display both original and unique names
 * 4. Demonstrate membership testing using contains() method
 * 5. Show the total count of unique names
 *
 * Requirements:
 * - Use String array to store initial names with duplicates
 * - Convert array to HashSet using Arrays.asList()
 * - Use forEach() method to display unique names
 * - Demonstrate contains() method for membership testing
 * - Show size() method usage for counting unique elements
 */

import java.util.HashSet;
import java.util.Arrays;

public class NameDeduplication {
    public static void main(String[] args) {
        // Create array of names with duplicates
        String[] names = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};

        // Create HashSet and add all names
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        // Print original array
        System.out.println("Original array of names:");
        System.out.println(Arrays.toString(names));

        // Print unique names
        System.out.println("\nUnique names in HashSet:");
        uniqueNames.forEach(System.out::println);

        // Check if specific names exist
        String nameToCheck = "Varchasv";
        System.out.printf("\nIs '%s' in the set? %b\n", 
                         nameToCheck, uniqueNames.contains(nameToCheck));

        nameToCheck = "John";
        System.out.printf("Is '%s' in the set? %b\n", 
                         nameToCheck, uniqueNames.contains(nameToCheck));

        // Print total count of unique names
        System.out.printf("\nTotal number of unique names: %d\n", uniqueNames.size());
    }
}