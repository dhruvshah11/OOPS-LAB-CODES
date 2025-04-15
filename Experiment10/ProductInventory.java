package Experiment10;

/**
 * Problem Statement:
 * Write a Java program that implements a simple Product Inventory System using HashMap to:
 * 1. Store product IDs and their corresponding quantities
 * 2. Perform basic inventory operations (add, update, remove)
 * 3. Display the current state of inventory
 *
 * Requirements:
 * - Use HashMap to store product information (Key: ProductID, Value: Quantity)
 * - Implement basic inventory operations:
 *   - Adding new products
 *   - Updating product quantities
 *   - Removing products
 * - Create a method to display inventory status
 *
 * Expected Output:
 * - Show initial inventory state
 * - Display updated inventory after modifications
 * - Demonstrate proper use of HashMap methods
 */

import java.util.HashMap;

public class ProductInventory {
    public static void main(String[] args) {
        // Create HashMap to store product inventory
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add three products (productId -> quantity)
        inventory.put(1001, 50);  // Product 1001: 50 units
        inventory.put(1002, 30);  // Product 1002: 30 units
        inventory.put(1003, 75);  // Product 1003: 75 units

        // Display initial inventory
        System.out.println("Initial Inventory:");
        displayInventory(inventory);

        // Update quantity of product 1002
        inventory.put(1002, 40);  // Update product 1002 to 40 units
        System.out.println("\nInventory after updating product 1002:");
        displayInventory(inventory);

        // Remove product 1003
        inventory.remove(1003);
        System.out.println("\nInventory after removing product 1003:");
        displayInventory(inventory);
    }

    private static void displayInventory(HashMap<Integer, Integer> inventory) {
        inventory.forEach((productId, quantity) -> 
            System.out.printf("Product ID: %d, Quantity: %d\n", productId, quantity));
    }
}