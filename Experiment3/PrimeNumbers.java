package Experiment3;

/**
 * Question: Prime Number Generator and Counter
 *
 * Create a Java program that finds and displays all prime numbers between 1 and 1000.
 * The program should demonstrate efficient prime number checking algorithm and proper
 * output formatting.   
 *
 * Requirements:
 * 1. Find all prime numbers in range 1-1000
 * 2. Display the numbers in a formatted grid (10 numbers per line)
 * 3. Implement efficient prime checking algorithm using square root
 * 4. Count and display total number of prime numbers found
 *
 * Learning Objectives:
 * - Understanding prime number concepts
 * - Implementing nested loops
 * - Using Math class methods (sqrt)
 * - Output formatting techniques
 * - Algorithm optimization basics
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Prime numbers between 1 and 1000:");
        
        // Check each number from 2 to 1000
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;
            
            // Check if number is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If prime, print it and increment counter
            if (isPrime) {
                System.out.print(num + " ");
                count++;
                
                // Add new line after every 10 numbers for better readability
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        // Print total count
        System.out.println("\n\nTotal number of prime numbers: " + count);
    }
}