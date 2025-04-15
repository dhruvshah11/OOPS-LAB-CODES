package Experiment10;

import java.util.ArrayList;

/**
 * Question: Employee Management System using ArrayList
 *
 * Create a Java program that implements an Employee Management System using ArrayList
 * to demonstrate the usage of Java Collections Framework and object manipulation.
 *
 * Requirements:
 * 1. Implement Employee class with:
 *    - Private member variables (encapsulation)
 *    - Constructor for initialization
 *    - Getter/Setter methods
 *    - toString() method override
 * 2. Demonstrate ArrayList operations:
 *    - Adding employees
 *    - Updating employee information
 *    - Displaying employee list
 *    - Basic data manipulation
 *
 * Learning Objectives:
 * - Understanding ArrayList usage
 * - Working with custom objects in collections
 * - Implementing proper encapsulation
 * - Object state manipulation
 * - Collection traversal techniques
 */

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d, name='%s', salary=%.2f]", id, name, salary);
    }
}

public class EmployeeArrayList {
    public static void main(String[] args) {
        // Create ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Add three employees
        employees.add(new Employee("John Doe", 101, 50000.0));
        employees.add(new Employee("Jane Smith", 102, 55000.0));
        employees.add(new Employee("Bob Johnson", 103, 45000.0));

        // Print initial list
        System.out.println("Initial Employee List:");
        employees.forEach(System.out::println);

        // Update salary of employee with ID 102
        for (Employee emp : employees) {
            if (emp.getId() == 102) {
                emp.setSalary(60000.0);
                System.out.println("\nUpdated salary for employee ID 102");
                break;
            }
        }

        // Remove employee with ID 103
        employees.removeIf(emp -> emp.getId() == 103);
        System.out.println("\nEmployee List after removing ID 103:");
        employees.forEach(System.out::println);
    }
}