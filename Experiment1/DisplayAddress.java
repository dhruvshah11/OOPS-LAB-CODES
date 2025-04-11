/**
 * Program to display name and complete address in different lines
 */
public class DisplayAddress {
    public static void main(String[] args) {
        // Display name and address on different lines
        System.out.println("Name: Aman Sharma");
        System.out.println("Address Line 1: 42 Rajendra Nagar");
        System.out.println("Address Line 2: Sector 12");
        System.out.println("City: New Delhi");
        System.out.println("State: Delhi");
        System.out.println("Pin: 110001");
        System.out.println("Country: India");
        
        // Alternative method using a single println with escape sequences
        System.out.println("\nAlternative display using escape sequences:\n" +
                           "Name: Aman Sharma\n" +
                           "Address Line 1: 42 Rajendra Nagar\n" +
                           "Address Line 2: Sector 12\n" +
                           "City: New Delhi\n" +
                           "State: Delhi\n" +
                           "Pin: 110001\n" +
                           "Country: India");
    }
}