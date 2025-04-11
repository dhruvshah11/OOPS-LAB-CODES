package Experiment3;

import java.util.Arrays;

/**
 * Program to copy all elements from one array to another using a loop
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