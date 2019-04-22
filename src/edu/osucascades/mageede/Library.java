package edu.osucascades.mageede;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String address;
    List<Object> books;

    private Library(String address) {
        this.address = address;
        books = new ArrayList<>();
    }

    private static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    private void printAddress() {
        System.out.println(address);
    }

    private void addBook(Object book) {
        books.add(book);
    }

    private void borrowBook(String bookName) {
        for (int i = 0; i <= books.size(); i++) {
            if (books.contains(bookName)) {
                System.out.println("You successfully borrowed " + bookName);
            } else {
                System.out.println("Sorry, this book is already borrowed.");
            }
        }
    }

    private void returnBook(String bookName) {

    }

    private void printAvailableBooks() {

    }

    public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
//// Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
//// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
//// Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//// Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//// Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
    }
}
