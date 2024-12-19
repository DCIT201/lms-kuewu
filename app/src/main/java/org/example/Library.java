package org.example;

import java.util.ArrayList;


public class Library {
    private String name;
    private ArrayList<Book> books;


    //constructor
    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    //Add a book to the library
    public boolean addBook(Book book){
        books.add(book);
        return false;
    }

    //Remove book from the library
    public boolean removeBook(Book book){
        return books.remove(book);
    }

    //List available books
    public void listAvailableBooks(){
        for (Book book: books){
            if (book.isAvailable()){
                System.out.println(book.getTitle() + "by" + book.getAuthor());
            }
        }
    }

    //find book by its title
    public Book findBookByTitle(String Title, String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable()){
                return book;
            }
        }
        return null; // if the book is not found
    }
    //find book by author
    public Book findBookByTitle(String Author){

        for(Book book: books){

            if(book.getAuthor().equalsIgnoreCase(Author) && book.isAvailable()){
                return book;
            }
        }
        return null; // if the book is not found
    }

    //Get the library's name
    public String getName() {
        return name;
    }
}
