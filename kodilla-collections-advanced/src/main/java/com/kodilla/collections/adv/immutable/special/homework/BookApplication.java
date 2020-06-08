package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();

        book.createBook("Lord Of The Rings", "J. R. R. Tolkien");
        book.createBook("Harry Potter", "J. K. Rowling");
        book.createBook("Harry Potter", "J. K. Rowling");
        book.createBook("Shining", "Stephen King");
    }
}