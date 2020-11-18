package com.github.valentinkarnaukhov.prototype;

/**
 * @author Valentin Karnaukhov
 */
public class PaperBook extends Book implements Cloneable {

    private final String cover;

    public PaperBook(int pages, String author, String title, String cover) {
        super(pages, author, title);
        this.cover = cover;
    }

    private PaperBook(PaperBook book) {
        super(book);
        this.cover = book.cover;
    }

    public void read() {
        System.out.println(super.title + "\n" + super.author + "\n" + super.pages + "\n" + this.cover);
    }

    public Book clone() {
        return new PaperBook(this);
    }
}
