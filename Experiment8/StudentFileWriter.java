package Experiment8;

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