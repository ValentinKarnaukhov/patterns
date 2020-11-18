package com.github.valentinkarnaukhov.prototype;

/**
 * @author Valentin Karnaukhov
 */
public class EBook extends Book implements Cloneable {

    private final int size;

    public EBook(int pages, String author, String title, int size) {
        super(pages, author, title);
        this.size = size;
    }

    private EBook(EBook book) {
        super(book);
        this.size = book.size;
    }

    public void read() {
        System.out.println(super.title + "\n" + super.author + "\n" + super.pages + "\n" + this.size);
    }

    public Book clone() {
        return new EBook(this);
    }
}
