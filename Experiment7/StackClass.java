package Experiment7;

import java.util.Scanner;

interface StackInterface {
    void push();
    void pop();
    void display();
}

public class StackClass implements StackInterface {
    private int[] stack;
    private int top;
    private static final int MAX_SIZE = 5;
    private Scanner scanner;
    
    public StackClass() {
        stack = new int[MAX_SIZE];
        top = -1;
        scanner = new Scanner(System.in);
    }
    
    @Override
    public void push() {
        if (top >= MAX_SIZE - 1) {
            System.out.println("\nStack Overflow! Cannot push more elements.");
            return;
        }
        
        System.out.print("Enter element to push: ");
        int element = scanner.nextInt();
        stack[++top] = element;
        System.out.println("Pushed " + element + " to stack");
    }
    
    @Override
    public void pop() {
        if (top < 0) {
            System.out.println("\nStack Underflow! Cannot pop from empty stack.");
            return;
        }
        
        int element = stack[top--];
        System.out.println("Popped " + element + " from stack");
    }
    
    @Override
    public void display() {
        if (top < 0) {
            System.out.println("\nStack is empty!");
            return;
        }
        
        System.out.println("\nStack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    
    public static void main(String[] args) {
        StackClass stack = new StackClass();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
        stack.scanner.close();
    }
}