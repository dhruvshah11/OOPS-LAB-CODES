package Experiment4;

/**
 * Question: Method Overloading in Calculator Class
 *
 * Create a Calculator class that demonstrates the concept of method overloading
 * by implementing multiple versions of an addition method with different parameters.
 *
 * Requirements:
 * 1. Implement three overloaded 'add' methods:
 *    - Method to add two integers
 *    - Method to add three integers
 *    - Method to add two double values
 * 2. Each method should:
 *    - Accept appropriate number and type of parameters
 *    - Return the sum of the parameters
 *    - Use appropriate return type (int or double)
 * 3. Demonstrate the usage of all overloaded methods
 *
 * Learning Objectives:
 * - Understanding method overloading concept
 * - Working with different data types
 * - Method parameter and return type selection
 * - Object-oriented programming basics
 * - Code organization and readability
 */
public class Calculator {
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to add three integers
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    // Method to add two doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Test two integers addition
        int result1 = calc.add(5, 3);
        System.out.println("5 + 3 = " + result1);
        
        // Test three integers addition
        int result2 = calc.add(5, 3, 2);
        System.out.println("5 + 3 + 2 = " + result2);
        
        // Test two doubles addition
        double result3 = calc.add(5.5, 3.5);
        System.out.println("5.5 + 3.5 = " + result3);
    }
}