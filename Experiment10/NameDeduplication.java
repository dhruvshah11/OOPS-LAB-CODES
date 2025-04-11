package Experiment10;

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