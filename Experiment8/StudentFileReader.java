package Experiment8;

/**
 * Question: Reading Student Records from File
 * 
 * Create a Java program that demonstrates reading student records from a file
 * with proper exception handling. The program should:
 * 1. Read student information from a text file
 * 2. Handle potential exceptions:
 *    - FileNotFoundException for missing files
 *    - IOException for reading errors
 * 3. Use BufferedReader for efficient file reading
 * 4. Display student records or error messages
 * 
 * This program demonstrates:
 * - File I/O operations
 * - BufferedReader usage
 * - Exception handling hierarchy
 * - Error reporting
 * - Resource management
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        try {
            // Create FileReader object
            FileReader fr = new FileReader("student.txt");
            BufferedReader reader = new BufferedReader(fr);
            
            System.out.println("Reading student records from file:\n");
            String line;
            
            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file not found!");
            System.out.println("Please make sure the file exists in the current directory.");
            
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}