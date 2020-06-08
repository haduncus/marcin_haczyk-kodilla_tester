package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    protected List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        boolean notDuplicate = true;
        if (books.size() > 1) {
            for (int i = 1; i < books.size(); i++) {
                if (book.getTitle().equals(books.get(i - 1).getTitle()) && book.getAuthor().equals(books.get(i - 1).getAuthor())) {
                    notDuplicate = false;
                }
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        if (notDuplicate) {
            System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthor() + ", hashCode: " + book.hashCode());
        } else {
            System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthor() + ", hashCode: " + book.hashCode() + " - That book is already on the list!");
        }
        return book;
    }
}