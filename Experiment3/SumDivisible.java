package Experiment3;

/**
 * Question: Write a Java program to find the sum of numbers divisible by both 6 and 9.
 *
 * Problem Statement:
 * - Calculate the sum of all integers between 10 and 950 (inclusive)
 * - Numbers must be divisible by both 6 and 9 (i.e., divisible by LCM(6,9) = 18)
 * - Use a loop to iterate through the range
 * - Apply the divisibility test using modulo operator
 * - Display the final sum
 *
 * Learning Objectives:
 * - Understanding loops and conditions
 * - Working with modulo operator
 * - Number divisibility concepts
 * - Basic arithmetic operations
 */
public class SumDivisible {
    public static void main(String[] args) {
        int sum = 0;
        
        // Loop through numbers from 10 to 950
        for (int i = 10; i <= 950; i++) {
            // Check if number is divisible by both 6 and 9
            if (i % 6 == 0 && i % 9 == 0) {
                sum += i;
            }
        }
        
        // Display result
        System.out.println("Sum of numbers between 10 and 950 that are divisible by both 6 and 9: " + sum);
    }
}