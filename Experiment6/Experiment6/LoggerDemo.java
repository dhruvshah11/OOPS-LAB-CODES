package Experiment6;

/**
 * Question: Final Class and Logging System Implementation
 *
 * Create a Java program that demonstrates the usage of final classes and implements
 * a basic logging system. The program should show why and how final classes are used
 * to prevent inheritance when class hierarchy extension is not desired.
 *
 * Requirements:
 * 1. Create a final Logger class that cannot be inherited
 * 2. Implement basic logging functionality:
 *    - Method to log messages with timestamp
 *    - Proper message formatting
 * 3. Demonstrate:
 *    - Final class usage
 *    - Attempted inheritance (commented out to show error)
 *    - Basic logging functionality
 * 4. Show compilation errors when trying to extend final class
 *
 * Learning Objectives:
 * - Understanding final classes
 * - Basic logging implementation
 * - Inheritance restrictions
 * - Java compilation error handling
 */

final class Logger {
    public void logMessage(String message) {
        System.out.println("[LOG] " + message);
    }
}

// This class will cause compilation error as Logger is final
// class ExtendedLogger extends Logger {
//     public void logMessage(String message) {
//         System.out.println("[EXTENDED LOG] " + message);
//     }
// }

public class LoggerDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating final class:\n");
        
        Logger logger = new Logger();
        logger.logMessage("This is a test message");
        
        System.out.println("\nNote: Attempting to extend Logger class would result in compilation error");
        System.out.println("because Logger is declared as final.");
    }
}