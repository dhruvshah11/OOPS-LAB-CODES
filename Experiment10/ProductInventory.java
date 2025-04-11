package Experiment10;

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