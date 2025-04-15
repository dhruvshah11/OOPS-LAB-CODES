package Experiment4;

/**
 * Question: University Student Management System with Static Members
 *
 * Create a Java program that implements a University Student Management System to demonstrate
 * the use of static and non-static members. The program should track student information
 * and maintain university-wide data.
 *
 * Requirements:
 * 1. Implement StaticDemo class with:
 *    - Instance variables for student details (name, ID)
 *    - Static variables for university name and total student count
 *    - Constructor to initialize student details and update total count
 *    - Static methods to manage university-wide data
 *    - Instance methods to display individual student information
 *
 * 2. Demonstrate:
 *    - Object creation for multiple students
 *    - Static member access and modification
 *    - Effect of static member changes on all instances
 *    - Proper student count tracking
 *
 * Learning Objectives:
 * - Understanding static vs non-static members
 * - Implementing shared data using static variables
 * - Managing instance-specific and class-wide information
 * - Proper usage of static methods
 * - Object state management
 */
public class StaticDemo {
    // Instance variables (non-static)
    private String studentName;
    private int studentId;
    
    // Static variable (shared across all instances)
    private static String universityName = "MyUniversity";
    private static int totalStudents = 0;
    
    // Constructor
    public StaticDemo(String name, int id) {
        this.studentName = name;
        this.studentId = id;
        totalStudents++; // Increment total students count
    }
    
    // Static method to change university name
    public static void changeUniversityName(String newName) {
        universityName = newName;
        System.out.println("University name changed to: " + universityName);
    }
    
    // Static method to get total students
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    // Instance method to display student details
    public void displayStudentInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("University: " + universityName);
    }
    
    public static void main(String[] args) {
        // Create multiple student objects
        StaticDemo student1 = new StaticDemo("John", 101);
        StaticDemo student2 = new StaticDemo("Alice", 102);
        StaticDemo student3 = new StaticDemo("Bob", 103);
        
        // Display initial information
        System.out.println("Initial University Name: " + universityName);
        System.out.println("Total Students: " + getTotalStudents());
        
        // Display individual student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        
        // Change university name (affects all instances)
        System.out.println("\nChanging University Name...");
        changeUniversityName("New University");
        
        // Display updated information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}