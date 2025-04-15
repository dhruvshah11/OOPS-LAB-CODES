

/**
 * Question: Understanding Final Keyword in Java
 *
 * Create a Java program that demonstrates the usage and implications of the final
 * keyword in different contexts - variables, methods, and classes.
 *
 * Requirements:
 * 1. Demonstrate final keyword with:
 *    - Final variable (constant)
 *    - Final method that cannot be overridden
 *    - Class inheritance restrictions
 * 2. Implement:
 *    - A class with final constant
 *    - Method attempting to modify final variable
 *    - Inheritance scenario with final method
 * 3. Show:
 *    - Compilation errors when trying to modify final members
 *    - Proper usage in calculations
 *
 * Learning Objectives:
 * - Understanding final keyword usage
 * - Constant declaration and usage
 * - Method overriding restrictions
 * - Inheritance limitations
 * - Java compilation error handling
 */

class MathConstants {
    final double PI = 3.14159;
    
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

class Circle extends MathConstants {
    public void calculateArea(double radius) {
        // Cannot modify PI as it is final
        // PI = 3.14; // This would cause compilation error
        
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);
    }
    
    // Cannot override displayPI() as it is final
    // void displayPI() { // This would cause compilation error
    //     System.out.println("Attempting to override final method");
    // }
}

public class FinalDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        System.out.println("Demonstrating final keyword with variable and method:\n");
        
        // Display the value of PI
        circle.displayPI();
        
        // Calculate and display area
        circle.calculateArea(5.0);
    }
}