package Experiment8;

/**
 * Question: Inner Class Implementation with Car Engine
 * 
 * Create a Java program that demonstrates the use of inner classes using a Car-Engine relationship.
 * The program should:
 * 1. Define a Car class with an inner Engine class
 * 2. Implement methods in the Engine class for basic operations:
 *    - Starting the engine
 *    - Stopping the engine
 * 3. Show how to:
 *    - Create an instance of the inner class
 *    - Access inner class methods from outer class
 *    - Maintain encapsulation of engine operations
 * 
 * This program demonstrates:
 * - Inner class implementation
 * - Object-oriented encapsulation
 * - Class relationship modeling
 * - Method invocation between classes
 */

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