package Experiment4;

/**
 * Course class demonstrating the use of 'this' keyword
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