package Experiment5;

import java.util.Scanner;

/*
Problem Statement:
Implement a Trunk Call Billing System that calculates charges for different types of calls.
The system should support three types of calls with different rate calculations:
1. Ordinary calls (base rate)
2. Urgent calls (double rate)
3. Lightning calls (triple rate)

Requirements:
1. Create an abstract base class for trunk calls
2. Implement three different call types with specific rate calculations
3. Use runtime polymorphism for charge calculation
4. Accept user input for call duration and type
5. Display calculated charges based on call type

Key Concepts Demonstrated:
- Abstract Classes and Methods
- Inheritance Hierarchy
- Runtime Polymorphism
- Method Overriding
- User Input Processing
- Rate Calculation Strategies
*/

// Abstract base class for all call types
abstract class TrunkCall {
    protected int duration;
    protected double ratePerMinute;
    
    public TrunkCall(int duration) {
        this.duration = duration;
    }
    
    public abstract double calculateCharges();
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
        this.ratePerMinute = 1.0; // Base rate for ordinary calls
    }
    
    @Override
    public double calculateCharges() {
        return duration * ratePerMinute;
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
        this.ratePerMinute = 2.0; // Double rate for urgent calls
    }
    
    @Override
    public double calculateCharges() {
        return duration * ratePerMinute;
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
        this.ratePerMinute = 3.0; // Triple rate for lightning calls
    }
    
    @Override
    public double calculateCharges() {
        return duration * ratePerMinute;
    }
}

public class TrunkCallSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter call duration (in minutes): ");
        int duration = scanner.nextInt();
        
        System.out.println("\nSelect call type:");
        System.out.println("1. Ordinary");
        System.out.println("2. Urgent");
        System.out.println("3. Lightning");
        int choice = scanner.nextInt();
        
        TrunkCall call;
        switch (choice) {
            case 1:
                call = new OrdinaryCall(duration);
                System.out.println("\nOrdinary Call Charges: $" + call.calculateCharges());
                break;
            case 2:
                call = new UrgentCall(duration);
                System.out.println("\nUrgent Call Charges: $" + call.calculateCharges());
                break;
            case 3:
                call = new LightningCall(duration);
                System.out.println("\nLightning Call Charges: $" + call.calculateCharges());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}