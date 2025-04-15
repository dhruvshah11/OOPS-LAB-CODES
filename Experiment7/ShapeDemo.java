package Experiment7;

/**
 * Question: Abstract Shape Class Implementation
 *
 * Create a Java program that implements an abstract Shape class and its concrete
 * implementations to demonstrate abstraction and inheritance in geometric calculations.
 *
 * Requirements:
 * 1. Create abstract Shape class with:
 *    - Abstract method for area calculation
 * 2. Implement concrete classes:
 *    - Rectangle with length and width
 *    - Circle with radius
 * 3. Demonstrate:
 *    - Abstract method implementation
 *    - Area calculations
 *    - Proper constant usage (PI)
 *
 * Learning Objectives:
 * - Understanding abstract classes
 * - Implementing abstract methods
 * - Working with geometric calculations
 * - Class hierarchy design
 * - Constant declaration and usage
 */

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}