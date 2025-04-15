package Experiment3;

/**
 * Question: Write a Java program to find the second largest element in an array.
 *
 * Problem Statement:
 * - Create a program that finds the second largest element in an array
 * - Do not use array sorting
 * - Handle duplicate elements correctly
 * - Use a single pass through the array
 * - Display both the array contents and the second largest element
 *
 * Example:
 * Array: [12, 35, 1, 10, 34, 1, 35]
 * Second largest: 34
 *
 * Learning Objectives:
 * - Array traversal
 * - Conditional logic
 * - Handling edge cases
 * - Algorithm optimization
 */
public class SecondLargest {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = {12, 35, 1, 10, 34, 1, 35};
        
        // Variables to track largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        // Display array
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Display result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("\nNo second largest element exists.");
        } else {
            System.out.println("\nSecond largest element: " + secondLargest);
        }
    }
}