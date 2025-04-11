package Experiment4;

/**
 * Employee Management System demonstrating OOP concepts
 */
public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    private static int totalEmployees = 0;
    
    // Default constructor
    public Employee() {
        this.employeeID = ++totalEmployees;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
    }
    
    // Parameterized constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    
    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }
    
    // Method to calculate and return salary
    public double calculateSalary() {
        return this.salary;
    }
    
    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + this.employeeID);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
    }
    
    public static void main(String[] args) {
        // Create employees using both constructors
        Employee emp1 = new Employee(); // Default constructor
        Employee emp2 = new Employee(2, "John Doe", "IT", 50000.0); // Parameterized constructor
        Employee emp3 = new Employee(3, "Jane Smith", "HR", 45000.0);
        
        // Display total number of employees
        System.out.println("Employee Management System");
        displayTotalEmployees();
        
        // Display employee details and salaries
        emp1.displayEmployeeInfo();
        System.out.println("Calculated Salary: $" + emp1.calculateSalary());
        
        emp2.displayEmployeeInfo();
        System.out.println("Calculated Salary: $" + emp2.calculateSalary());
        
        emp3.displayEmployeeInfo();
        System.out.println("Calculated Salary: $" + emp3.calculateSalary());
    }
}