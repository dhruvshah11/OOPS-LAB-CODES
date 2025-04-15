package Experiment5;

/*
Problem Statement:
Implement a worker payment system that demonstrates the use of abstract classes and inheritance.
The system should handle two types of workers:
1. Daily workers who are paid based on the number of days worked (8 hours = 1 day)
2. Salaried workers who receive a fixed weekly salary regardless of extra hours

Requirements:
1. Create an abstract Worker class with name and salary rate attributes
2. Implement concrete DailyWorker and SalariedWorker classes
3. Use abstract method for pay computation with different implementations
4. Test the system with various working hours

Key Concepts Demonstrated:
- Abstract Classes and Methods
- Inheritance and Method Overriding
- Polymorphism through abstract class reference
- Different salary calculation strategies
- Constructor chaining using super()
*/

// Abstract base class for all workers
abstract class Worker {
    protected String name;
    protected double salaryRate;
    
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract double computePay(int hours);
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }
    
    @Override
    public double computePay(int hours) {
        // Calculate days worked (assuming 8 hours per day)
        int daysWorked = hours / 8;
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double weeklyRate) {
        super(name, weeklyRate);
    }
    
    @Override
    public double computePay(int hours) {
        // Salaried workers get fixed weekly pay regardless of hours
        // as long as they work at least 40 hours
        return salaryRate;
    }
}

public class WorkerHierarchy {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John", 100.0); // $100 per day
        Worker salariedWorker = new SalariedWorker("Jane", 1000.0); // $1000 per week
        
        // Test with different hours
        int[] hoursWorked = {32, 40, 45};
        
        for (int hours : hoursWorked) {
            System.out.println("Hours worked: " + hours);
            System.out.println("Daily Worker pay: $" + dailyWorker.computePay(hours));
            System.out.println("Salaried Worker pay: $" + salariedWorker.computePay(hours));
            System.out.println();
        }
    }
}