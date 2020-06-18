package com.kodilla.soap.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.Category;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book lotr = new Book();
        lotr.setSignatureNo("F-1");
        lotr.setTitle("Lord of the Rings");
        lotr.setAuthor("J.R.R. Tolkien");
        lotr.setPublishmentYear(1954);
        lotr.setCategory(Category.FANTASY);

        books.put(lotr.getSignatureNo(), lotr);

        Book potter = new Book();
        potter.setSignatureNo("F-2");
        potter.setTitle("Harry Potter");
        potter.setAuthor("J.K. Rowling");
        potter.setPublishmentYear(1997);
        potter.setCategory(Category.FANTASY);

        books.put(potter.getSignatureNo(), potter);

        Book solaris = new Book();
        solaris.setSignatureNo("SF-1");
        solaris.setTitle("Solaris");
        solaris.setAuthor("Stanislaw Lem");
        solaris.setPublishmentYear(1961);
        solaris.setCategory(Category.SCI_FI);

        books.put(solaris.getSignatureNo(), solaris);

        Book orientExpress = new Book();
        orientExpress.setSignatureNo("C-1");
        orientExpress.setTitle("Mourder on the Orient Express");
        orientExpress.setAuthor("Aghata Christie");
        orientExpress.setPublishmentYear(1934);
        orientExpress.setCategory(Category.CRIME);

        books.put(orientExpress.getSignatureNo(), orientExpress);
    }

    public Book findBook(String signatureNo) {
        Assert.notNull(signatureNo, "You have to specify the book's signature number");
        return books.get(signatureNo);
    }
}