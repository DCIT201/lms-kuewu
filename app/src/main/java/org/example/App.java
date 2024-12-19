/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App  {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Create library instance
        Library library = new Library("City Library");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald",1923);
        Book book2 = new Book("1984", "George Orwell",2022);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee",2000);

System.out.println(book1.getTitle());

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);



        // Create patron instance
        Patron patron1 = new Patron("Alice", "P001");

        // Borrowing a book
        if (patron1.borrowBook(library, "1984")) {
            System.out.println(patron1.getName() + " borrowed '1984'.");
        } else {
            System.out.println("The book '1984' is not available.");
        }

        // Display available books in the library
        System.out.println("\nAvailable books in " + library.getName() + ":");
        library.listAvailableBooks();

        // Returning a book
        if (patron1.returnBook(library, "1984")) {
            System.out.println(patron1.getName() + " returned '1984'.");
        } else {
            System.out.println("The book '1984' is not borrowed by " + patron1.getName());
        }

        // Display borrowed books
        patron1.displayBorrowedBooks();

        // Display available books after return
        System.out.println("\nAvailable books in " + library.getName() + " after return:");
        library.listAvailableBooks();
    }
}

