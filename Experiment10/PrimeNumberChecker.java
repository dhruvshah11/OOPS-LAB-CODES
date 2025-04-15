package Experiment10;

/**
 * Problem Statement:
 * Write a Java program that demonstrates the use of ArrayList and autoboxing/unboxing to:
 * 1. Create an ArrayList of Integer objects
 * 2. Use autoboxing to add primitive integers to the ArrayList
 * 3. Check each number for primality using unboxing
 *
 * Requirements:
 * - Implement ArrayList to store numbers
 * - Demonstrate autoboxing when adding numbers
 * - Show unboxing when checking primality
 * - Create a method to check if a number is prime
 *
 * Expected Output:
 * - Display whether each number in the list is prime or not
 * - Show proper use of autoboxing and unboxing operations
 */

import java.util.ArrayList;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create ArrayList and add numbers using autoboxing
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);  // Autoboxing: int to Integer
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(17);
        numbers.add(20);

        // Iterate through list, unbox values and check for prime numbers
        System.out.println("Checking numbers for primality:");
        for (Integer num : numbers) {
            int value = num;  // Unboxing: Integer to int
            System.out.printf("%d is %s\n", value, isPrime(value) ? "prime" : "not prime");
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}