package com.accenture;

public class Library {
	private String bookName;
    private String author;
    private boolean availability;

    // Constructor
    public Library(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.availability = true; // Assume book is initially available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed the book: " + bookName);
        } else {
            System.out.println("Sorry, the book is currently not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("You have successfully returned the book: " + bookName);
        } else {
            System.out.println("Invalid operation. The book is already available.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Library object
        Library book = new Library("Everything starts with Us", "Collen Hover");

        // Display book details
        book.displayBookDetails();

        // Borrow the book
        book.borrowBook();

        // Return the book
        book.returnBook();
    }
}

