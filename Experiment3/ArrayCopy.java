package Experiment3;

import java.util.Arrays;

/**
 * Question 1: Array Copy Implementation
 *
 * Write a Java program that copies all elements from one array to another using a loop.
 * The program should demonstrate proper array manipulation techniques and verify that
 * the arrays are separate in memory.
 *
 * Requirements:
 * 1. Create a source array with initial values
 * 2. Create a destination array of the same size
 * 3. Copy elements one by one using a loop (not using built-in methods)
 * 4. Display both arrays before and after modifying the source array
 * 5. Demonstrate that arrays are separate in memory by modifying source array
 *
 * Learning Objectives:
 * - Understanding array initialization and copying
 * - Working with array indices and loops
 * - Demonstrating array reference vs value copying
 * - Using Arrays.toString() for array output
 * - Basic array manipulation techniques
 */
public class ArrayCopy {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};
        
        // Create destination array with same length
        int[] destinationArray = new int[sourceArray.length];
        
        // Copy elements using loop
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        // Display results
        System.out.println("Source array: " + Arrays.toString(sourceArray));
        System.out.println("Copied array: " + Arrays.toString(destinationArray));
        
        // Verify arrays are distinct objects
        sourceArray[0] = 99; // Modify source array
        System.out.println("\nAfter modifying source array:");
        System.out.println("Source array: " + Arrays.toString(sourceArray));
        System.out.println("Copied array: " + Arrays.toString(destinationArray));
    }
}