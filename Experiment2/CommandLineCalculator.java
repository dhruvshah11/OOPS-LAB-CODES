/**
 * Program to implement a command line calculator
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