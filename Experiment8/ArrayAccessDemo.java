package Experiment8;

import java.util.Scanner;

public class ArrayAccessDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Initialize array with some values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10;
        }
        
        try {
            // Display array contents
            System.out.println("Array contents:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
            
            // Get index from user
            System.out.print("\nEnter an index (0-4) to access the array: ");
            int index = scanner.nextInt();
            
            // Access and display element
            System.out.println("Value at index " + index + ": " + numbers[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index! Please enter an index between 0 and 4.");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
            
        } finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}