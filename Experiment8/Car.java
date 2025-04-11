package Experiment8;

public class Car {
    // Inner class Engine
    private class Engine {
        public void start() {
            System.out.println("Engine started");
        }
        
        public void stop() {
            System.out.println("Engine stopped");
        }
    }
    
    public void drive() {
        // Creating an instance of the Engine class
        Engine engine = new Engine();
        
        // Calling Engine methods
        engine.start();
        System.out.println("Car is driving...");
        engine.stop();
    }
    
    public static void main(String[] args) {
        // Creating an instance of Car
        Car car = new Car();
        
        // Calling drive method
        car.drive();
    }
}