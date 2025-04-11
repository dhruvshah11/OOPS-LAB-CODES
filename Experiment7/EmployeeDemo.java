package Experiment7;

abstract class Employee {
    protected String name;
    protected String role;
    protected double baseSalary;
    
    public Employee(String name, String role, double baseSalary) {
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }
    
    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager", baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
    
    @Override
    void displayDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

class Developer extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    public Developer(String name, int hoursWorked, double hourlyRate) {
        super(name, "Developer", 0); // Base salary will be calculated from hours
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    
    @Override
    void displayDetails() {
        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 5000, 1000);
        Developer developer = new Developer("Jane Smith", 160, 25);
        
        manager.displayDetails();
        developer.displayDetails();
    }
}