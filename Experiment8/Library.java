package Experiment8;

/**
 * Question: Library Management using Static Nested Classes
 * 
 * Create a Java program that demonstrates the use of static nested classes
 * using a Library-Book relationship. The program should:
 * 1. Define a Library class with a static nested Book class
 * 2. Implement the Book class with:
 *    - Private fields for book details
 *    - Constructor for initialization
 *    - Method to display book information
 * 3. Show how to:
 *    - Create instances of static nested class
 *    - Access and display book details
 *    - Maintain proper encapsulation
 * 
 * This program demonstrates:
 * - Static nested class implementation
 * - Object-oriented principles
 * - Data encapsulation
 * - Constructor usage
 * - Method implementation
 */

public class Library {
    // Static nested class Book
    public static class Book {
        private String title;
        private String author;
        private String isbn;
        
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }
        
        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    
    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book book = new Book("The Java Programming Language", "James Gosling", "978-0321349804");
        
        // Displaying book details
        book.displayDetails();
    }
}