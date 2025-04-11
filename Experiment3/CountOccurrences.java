import java.util.Scanner;

/**
 * Program to count how many times a given number appears in an array
 */
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize array
        int[] arr = {2, 3, 2, 5, 2, 6};
        
        // Get target number from user
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        
        // Count occurrences
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        // Display result
        System.out.println("\nArray elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber " + target + " appears " + count + " times in the array.");
        
        // Close scanner
        scanner.close();
    }
}