package Experiment5;

/*
Problem Statement:
Implement a Vehicle Management System that demonstrates hierarchical inheritance
with different types of vehicles including cars, electric cars, and motorcycles.

Requirements:
1. Create a base Vehicle class with common attributes (brand, model, price)
2. Implement Car class extending Vehicle with car-specific features
3. Create ElectricCar class extending Car with electric vehicle properties
4. Implement Motorcycle class extending Vehicle with bike-specific attributes
5. Demonstrate proper inheritance relationships and method overriding

Key Concepts Demonstrated:
- Hierarchical Inheritance (Vehicle -> Car/Motorcycle)
- Multilevel Inheritance (Vehicle -> Car -> ElectricCar)
- Method Overriding
- Constructor Chaining
- Protected and Private Access Modifiers
- Specialized Class Attributes
*/

// Base class Vehicle
class Vehicle {
    protected String brand;
    protected String model;
    protected double price;
    
    // Default constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    private int seatingCapacity;
    private String fuelType;
    
    // Default constructor
    public Car() {
        super();
        this.seatingCapacity = 0;
        this.fuelType = "Unknown";
    }
    
    // Parameterized constructor
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// ElectricCar class extending Car
class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;
    
    // Default constructor
    public ElectricCar() {
        super();
        this.batteryCapacity = 0.0;
        this.chargingTime = 0.0;
    }
    
    // Parameterized constructor
    public ElectricCar(String brand, String model, double price, int seatingCapacity,
                       double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
    private double engineCapacity;
    private String type;
    
    // Default constructor
    public Motorcycle() {
        super();
        this.engineCapacity = 0.0;
        this.type = "Unknown";
    }
    
    // Parameterized constructor
    public Motorcycle(String brand, String model, double price, double engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Type: " + type);
    }
}

// Main class to test the vehicle hierarchy
public class VehicleHierarchy {
    public static void main(String[] args) {
        System.out.println("Testing Vehicle Hierarchy System\n");
        
        // Test Car
        System.out.println("Regular Car Details:");
        Car car = new Car("Toyota", "Camry", 25000.0, 5, "Petrol");
        car.displayDetails();
        System.out.println();
        
        // Test ElectricCar
        System.out.println("Electric Car Details:");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 45000.0, 5, 75.0, 8.0);
        electricCar.displayDetails();
        System.out.println();
        
        // Test Motorcycle
        System.out.println("Motorcycle Details:");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 7500.0, 750.0, "Cruiser");
        motorcycle.displayDetails();
    }
}