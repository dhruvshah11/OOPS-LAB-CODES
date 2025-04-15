package Experiment3;

/**
 * Question 2: Find Missing Number in Sequence
 *
 * Given an array containing N-1 unique numbers from 1 to N, write a Java program to find
 * the missing number. The program should use an efficient approach based on the sum formula
 * for sequence of numbers.
 *
 * Requirements:
 * 1. Handle input array with N-1 numbers (one number missing from sequence 1 to N)
 * 2. Use mathematical approach (sum formula) to find missing number
 * 3. Example case: Input array [1, 5, 6, 2, 4] → Output: 3
 * 4. Display both input array and the missing number
 *
 * Learning Objectives:
 * - Understanding arithmetic sequences
 * - Implementing efficient mathematical solutions
 * - Array traversal and sum calculation
 * - Problem-solving using mathematical approach
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        // Initialize array with missing number
        int[] arr = {1, 5, 6, 2, 4};
        
        // Calculate N (the range of numbers)
        int n = arr.length + 1;
        
        // Calculate expected sum of numbers from 1 to N
        int expectedSum = (n * (n + 1)) / 2;
        
        // Calculate actual sum of array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Missing number is the difference
        int missingNumber = expectedSum - actualSum;
        
        // Display array
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Display result
        System.out.println("\nMissing number: " + missingNumber);
    }
}