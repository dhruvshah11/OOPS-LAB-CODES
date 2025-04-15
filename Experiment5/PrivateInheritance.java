package Experiment5;

/*
Problem Statement:
Demonstrate the behavior of private members in inheritance by creating a parent-child class relationship.
Show how private members can only be accessed through protected or public methods of the parent class.

Requirements:
1. Create a Parent class with private data member
2. Implement protected method to access private data
3. Create Child class that attempts to access private member
4. Demonstrate proper way to access private data through inheritance

Key Concepts Demonstrated:
- Private Access Modifier
- Protected Access Modifier
- Inheritance and Encapsulation
- Data Hiding
- Proper Access Methods
*/

class Parent {
    private int privateData = 10;
    
    protected void displayPrivateData() {
        System.out.println("Private data accessed from parent class: " + privateData);
    }
}

class Child extends Parent {
    void tryToAccessPrivateData() {
        // This line would cause a compilation error if uncommented
        // System.out.println("Trying to access private data: " + privateData);
        
        // Can only access private data through protected method
        System.out.println("Accessing private data through protected method:");
        displayPrivateData();
    }
}

public class PrivateInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.tryToAccessPrivateData();
    }
}