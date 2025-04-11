package Experiment4;

/**
 * Calculator class demonstrating method overloading
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