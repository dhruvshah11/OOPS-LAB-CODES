package Experiment3;

/**
 * Program to count and display prime numbers between 1 and 1000
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