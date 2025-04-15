/**
 * Question: Command Line Calculator Implementation
 *
 * Create a Java program that implements a command-line calculator to perform basic
 * arithmetic operations. The program should demonstrate proper command-line argument
 * handling and error management.
 *
 * Requirements:
 * 1. Accept three command-line arguments in order:
 *    - First number (operand 1)
 *    - Operator (+, -, *, /)
 *    - Second number (operand 2)
 * 2. Implement the following operations:
 *    - Addition (+)
 *    - Subtraction (-)
 *    - Multiplication (*)
 *    - Division (/)
 * 3. Include error handling for:
 *    - Invalid number of arguments
 *    - Invalid number format
 *    - Division by zero
 *    - Invalid operator
 *
 * Learning Objectives:
 * - Working with command-line arguments
 * - Implementing control structures (switch-case)
 * - Exception handling in Java
 * - Input validation techniques
 * - Basic arithmetic operations
 */
public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <number1> <operator> <number2>");
            System.out.println("Operators: + - * /");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;
            
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operator! Use +, -, *, or /");
                    return;
            }
            
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        }
    }
}