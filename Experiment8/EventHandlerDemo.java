package Experiment8;

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