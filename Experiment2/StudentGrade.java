/**
 * Question: Student Grade Calculator
 *
 * Write a Java program that calculates a student's final grade based on marks obtained
 * in three subjects. The program should validate input marks and assign appropriate
 * grade based on the average score.
 *
 * Requirements:
 * 1. Accept marks for three subjects (range: 0-100)
 * 2. Validate that marks are within valid range
 * 3. Calculate average of three subjects
 * 4. Assign grade based on the following criteria:
 *    - A: >= 90
 *    - B: >= 80
 *    - C: >= 70
 *    - D: >= 60
 *    - F: < 60
 *
 * Learning Objectives:
 * - Input validation using conditional statements
 * - Working with Scanner class for multiple inputs
 * - Calculating averages with type conversion
 * - Implementing multi-level grade classification
 * - Error handling for invalid inputs
 */
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter marks for three subjects (0-100):");
        
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        
        // Validate marks
        if (subject1 < 0 || subject1 > 100 || subject2 < 0 || subject2 > 100 || subject3 < 0 || subject3 > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            scanner.close();
            return;
        }
        
        // Calculate average
        double average = (subject1 + subject2 + subject3) / 3.0;
        
        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Final Grade: " + grade);
        
        // Close scanner
        scanner.close();
    }
}