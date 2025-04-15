package Experiment8;

/**
 * Question: Event Handler Implementation using Inner Classes
 * 
 * Create a Java program that demonstrates the use of local and anonymous inner classes
 * for event handling. The program should:
 * 1. Define an EventHandler interface
 * 2. Implement the interface using:
 *    - A local inner class
 *    - An anonymous inner class
 * 3. Show how to:
 *    - Create and use local inner classes within methods
 *    - Implement interfaces using anonymous classes
 *    - Handle events using different inner class types
 * 
 * This program demonstrates:
 * - Interface implementation
 * - Local inner classes
 * - Anonymous inner classes
 * - Event handling patterns
 * - Method overriding
 */

public class EventHandlerDemo {
    // Interface definition
    interface EventHandler {
        void handleEvent();
    }
    
    public void registerEvent() {
        // Local inner class implementation
        class LocalEventHandler implements EventHandler {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        
        // Creating and using local inner class
        EventHandler localHandler = new LocalEventHandler();
        localHandler.handleEvent();
    }
    
    public static void main(String[] args) {
        EventHandlerDemo demo = new EventHandlerDemo();
        
        // Using local inner class
        demo.registerEvent();
        
        // Using anonymous inner class
        EventHandler anonymousHandler = new EventHandler() {
            @Override
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        
        anonymousHandler.handleEvent();
    }
}