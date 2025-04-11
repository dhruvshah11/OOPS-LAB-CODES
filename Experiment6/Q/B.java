package Q;

import p.A;

public class B {
    public static void main(String[] args) {
        A objA = new A();
        
        System.out.println("Accessing methods from class A:");
        
        // Public method - accessible everywhere
        objA.publicMethod();
        
        // Protected method - not accessible in different package without inheritance
        // objA.protectedMethod(); // This will cause compilation error
        
        // Default method - not accessible in different package
        // objA.defaultMethod(); // This will cause compilation error
        
        // Private method - not accessible outside class A
        // objA.privateMethod(); // This will cause compilation error
        
        System.out.println("\nNote: Protected, default, and private methods are not accessible");
        System.out.println("due to access modifier restrictions across packages.");
    }
}