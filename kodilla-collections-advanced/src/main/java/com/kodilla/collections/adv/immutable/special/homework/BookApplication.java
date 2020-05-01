/*  Stwórz nowy pakiet com.kodilla.collections.adv.immutable.special.homework, a w nim:
    1. Klasę Book, która będzie posiadała pola private String title oraz private String author.
    2. Klasę BookManager, która będzie posiadała metodę public Book createBook(String title, String author) i będzie tworzyła nowy obiekt klasy Book o zadanych parametrach.
    3. Klasę BookApplication z metodą main.
    Mając powyższe, wykonaj następujące działania:
    1. W metodzie main utwórz 2-3 obiekty klasy Book, używając do tego celu BookManager.
    2. Sprawdź, czy adresy utworzonych obiektów są takie same.
    3. Zmodyfikuj klasę BookManager tak, aby podczas tworzenia obiektów klasy Book klasa ta sprawdzała,
        czy dany obiekt klasy Book już istnieje (o takim samym tytule i autorze). W tym celu musisz wyposażyć klasę BookManager w kolekcję utworzonych dotychczas obiektów klasy Book.
    4. Sprawdź, czy po tej modyfikacji adresy tworzonych obiektów Book się różnią, jeżeli tytuł i autor jest taki sam.*/
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