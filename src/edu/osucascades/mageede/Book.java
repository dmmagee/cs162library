package edu.osucascades.mageede;

public class Book {
    private String title;
    private boolean borrowed;

    // Creates a new Book
    Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    private void returned() {
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    private boolean isBorrowed() {
        return borrowed;
    }

    // Returns the title of the book
    private String getTitle() {
        return title;
    }

    private void rented() {
        this.borrowed = true;
    }

    public static void main(String[] arguments) {
// Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
