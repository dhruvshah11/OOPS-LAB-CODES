package Experiment8;

/**
 * Question: Writing Student Records to File
 * 
 * Create a Java program that demonstrates writing student records to a file
 * with proper exception handling. The program should:
 * 1. Accept student details from user input:
 *    - Name
 *    - Roll Number
 *    - Grade
 * 2. Write the information to a text file
 * 3. Handle potential exceptions:
 *    - IOException for writing errors
 * 4. Implement proper resource management
 * 5. Provide success/error feedback
 * 
 * This program demonstrates:
 * - File writing operations
 * - Scanner for user input
 * - Exception handling
 * - Resource cleanup
 * - Data formatting
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Open FileWriter in append mode
            FileWriter writer = new FileWriter("student.txt", true);
            
            // Get student details
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();
            
            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();
            
            // Write to file
            String studentRecord = String.format("Name: %s, Roll Number: %s, Grade: %s\n", 
                                               name, rollNumber, grade);
            writer.write(studentRecord);
            
            System.out.println("Student information successfully written to file.");
            writer.close();
            
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file!");
            e.printStackTrace();
            
        } finally {
            scanner.close();
        }
    }
}