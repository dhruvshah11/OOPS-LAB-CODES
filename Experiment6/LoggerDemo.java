package Experiment6;

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