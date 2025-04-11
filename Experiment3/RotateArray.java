package Experiment3;

import java.util.Arrays;

/**
 * Program to rotate an array right by K positions
 */
public class RotateArray {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate
        
        // Create copy of original array
        int[] original = Arrays.copyOf(arr, arr.length);
        
        // Ensure k is within array bounds
        k = k % arr.length;
        
        // Rotate array
        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i + k) % arr.length;
            arr[newPosition] = original[i];
        }
        
        // Display results
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Array after rotating right by " + k + " positions: " + Arrays.toString(arr));
    }
}