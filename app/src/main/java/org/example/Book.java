package org.example;

public class Book {
    private final String Title;
    private final String Author;
    private final int YearPublished;
    private boolean isAvailable;

    Book(String Title, String Author, int YearPublished) {
        this.Title = Title;
        this.Author = Author;
        this.YearPublished = YearPublished;

    }
    public String getTitle() {
        return Title;
    }
    public String getAuthor() {
       return Author;
    }
    public int getYearPublished() {
        return YearPublished;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void  setAvailable(boolean available) {
        this.isAvailable = available;

    }


    // This is your working class.
    
}
