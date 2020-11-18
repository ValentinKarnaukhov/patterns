package com.github.valentinkarnaukhov.prototype;

/**
 * @author Valentin Karnaukhov
 */
public abstract class Book {

    protected final int pages;
    protected final String author;
    protected  String title;

    public Book(int pages, String author, String title) {
        this.pages = pages;
        this.author = author;
        this.title = title;
    }

    protected Book(Book book) {
        this.pages = book.pages;
        this.author = book.author;
        this.title = book.title;
    }

    public abstract void read();
    public abstract Book clone();

}
