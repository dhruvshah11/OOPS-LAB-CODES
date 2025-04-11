package Experiment10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class UniqueSum {
    public static void main(String[] args) {
        // Create ArrayList with duplicate values
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));

        // Print original list
        System.out.println("Original ArrayList: " + numbers);

        // Convert to HashSet to get unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Unique values: " + uniqueNumbers);

        // Calculate sum of unique values
        int sum = 0;
        for (Integer num : uniqueNumbers) {
            sum += num;
        }

        // Print the sum
        System.out.println("Sum of unique values: " + sum);
    }
}