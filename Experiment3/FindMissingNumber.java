package Experiment3;

/**
 * Program to find the missing number in an array containing N-1 unique numbers from 1 to N
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