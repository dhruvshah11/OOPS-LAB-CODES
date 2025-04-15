package Experiment8;

/**
 * Question: File Reading with Exception Handling
 * 
 * Create a Java program that demonstrates file reading operations with proper exception handling.
 * The program should:
 * 1. Accept a filename from the user
 * 2. Implement a method that throws FileNotFoundException
 * 3. Handle potential exceptions:
 *    - FileNotFoundException for missing files
 *    - Other I/O related exceptions
 * 4. Use proper resource management
 * 5. Display file contents or appropriate error messages
 * 
 * This program demonstrates:
 * - File handling in Java
 * - Exception handling with throws clause
 * - Try-catch-finally blocks
 * - Scanner usage for file reading
 * - Resource cleanup
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    // Method that throws FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        
        try {
            System.out.println("File contents:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } finally {
            fileReader.close();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the file name to read: ");
            String fileName = scanner.nextLine();
            
            readFile(fileName);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Please check the file name and path.");
            
        } finally {
            System.out.println("File operation attempted.");
            scanner.close();
        }
    }
}