package Experiment3;

import java.util.Arrays;

/**
 * Question 3: Array Rotation Implementation
 *
 * Write a Java program to rotate an array right by K positions. The program should
 * demonstrate efficient array manipulation using temporary array and modulo operation
 * for position calculation.
 *
 * Requirements:
 * 1. Take an array and rotation count K as input
 * 2. Rotate array elements K positions to the right
 * 3. Example case: Input array [1, 2, 3, 4, 5] with K = 2 → Output: [4, 5, 1, 2, 3]
 * 4. Handle K values larger than array length using modulo
 * 5. Display both original and rotated arrays
 *
 * Learning Objectives:
 * - Array manipulation techniques
 * - Understanding array rotation algorithm
 * - Using modulo for array index wrapping
 * - Implementing efficient solution with Arrays utility
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