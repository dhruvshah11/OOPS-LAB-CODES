package Experiment5;

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