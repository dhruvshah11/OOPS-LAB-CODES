package Experiment3;

/**
 * Program to calculate sum of integers between 10 and 950 that are divisible by both 6 and 9
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