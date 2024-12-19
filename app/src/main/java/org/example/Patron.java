package org.example;
import java.util.ArrayList;

public class Patron {

    private String name;
    private String patronID;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String patronID) {
        this.name = name;
        this.patronID = patronID;
        this.borrowedBooks = new ArrayList<>();
    }

    // Borrow a book from the library
    public boolean borrowBook(Library library, String title) {
        Book book = library.findBookByTitle(title);
        if (book != null) {
            borrowedBooks.add(book);
            book.setAvailable(false);  // Mark the book as unavailable
            return true;
        }
        return false; // If book is not available
    }

    // Return a book to the library
    public boolean returnBook(Library library, String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                borrowedBooks.remove(book);
                book.setAvailable(true);  // Mark the book as available again
                return library.addBook(book); // Optional: you may not need to add back if already in the library
            }
        }
        return false; // If the book is not in the borrowed list
    }//

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    // Get patron details
    public String getName() {
        return name;
    }

    public String getPatronID() {
        return patronID;
    }

}
