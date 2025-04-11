package Experiment3;

/**
 * Program to find the second largest element in an array without sorting
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