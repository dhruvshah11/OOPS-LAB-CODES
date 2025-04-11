package Experiment8;

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