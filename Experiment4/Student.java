package Experiment4;

/**
 * Student class demonstrating constructors and static/non-static members
 */
public class Student {
    private String name;
    private int age;
    public static String universityName = "MyUniversity";
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Static method to display university name
    public static void displayUniversity() {
        System.out.println("University: " + universityName);
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        // Create objects using both constructors
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("John Doe", 20); // Parameterized constructor
        
        System.out.println("Student 1 (Default constructor):") 
        student1.displayDetails();
        
        System.out.println("\nStudent 2 (Parameterized constructor):")
        student2.displayDetails();
        
        // Demonstrate static method and variable
        System.out.println("\nUniversity Information:")
        displayUniversity();
    }
}