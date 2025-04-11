package Experiment10;

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