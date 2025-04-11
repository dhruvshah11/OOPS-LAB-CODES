package Experiment5;

class Employee {
    protected String name;
    protected int empid;
    protected double salary;
    
    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }
    
    // Parameterized constructor
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    
    // Method to return name
    public String getName() {
        return name;
    }
    
    // Method to return salary
    public double getSalary() {
        return salary;
    }
    
    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary increased by " + percentage + "%");
            System.out.println("New salary: $" + salary);
        } else {
            System.out.println("Invalid percentage for salary increase");
        }
    }
}

class Manager extends Employee {
    private String department;
    
    // Default constructor
    public Manager() {
        super();
        this.department = "Not Assigned";
    }
    
    // Parameterized constructor
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
    
    // Method to get department
    public String getDepartment() {
        return department;
    }
    
    // Override increaseSalary to add bonus for managers
    @Override
    public void increaseSalary(double percentage) {
        // Managers get an additional 5% bonus
        double managerBonus = 5.0;
        super.increaseSalary(percentage + managerBonus);
        System.out.println("(Includes " + managerBonus + "% manager bonus)");
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        // Test Employee class
        System.out.println("Testing Employee class:");
        Employee emp = new Employee("John Doe", 101, 50000.0);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Current Salary: $" + emp.getSalary());
        emp.increaseSalary(10.0);
        System.out.println();
        
        // Test Manager class
        System.out.println("Testing Manager class:");
        Manager mgr = new Manager("Jane Smith", 201, 75000.0, "IT");
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Department: " + mgr.getDepartment());
        System.out.println("Current Salary: $" + mgr.getSalary());
        mgr.increaseSalary(10.0);
    }
}