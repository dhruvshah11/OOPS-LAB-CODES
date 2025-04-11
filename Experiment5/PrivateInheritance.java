package Experiment5;

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