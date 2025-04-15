package Experiment4;

/**
 * Question: Course Registration System with 'this' Keyword
 *
 * Create a Java program that implements a Course Registration System to demonstrate
 * the proper usage of the 'this' keyword in distinguishing between instance variables
 * and method parameters.
 *
 * Requirements:
 * 1. Implement Course class with:
 *    - Instance variables for course details (name, code)
 *    - Constructor using 'this' keyword to handle name shadowing
 *    - Methods to display course information
 *
 * 2. Demonstrate:
 *    - Proper parameter to instance variable assignment
 *    - Clear usage of 'this' keyword
 *    - Proper information display
 *
 * Learning Objectives:
 * - Understanding the 'this' keyword
 * - Handling parameter shadowing
 * - Proper constructor implementation
 * - Basic class design principles
 * - Object state management
 */
public class Course {
    private String courseName;
    private String courseCode;
    
    // Constructor using 'this' to differentiate between parameters and instance variables
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
    }
    
    public static void main(String[] args) {
        // Create a course object
        Course javaProgramming = new Course("Java Programming", "CS101");
        
        // Display course details
        System.out.println("Course Details:");
        javaProgramming.displayCourseDetails();
    }
}