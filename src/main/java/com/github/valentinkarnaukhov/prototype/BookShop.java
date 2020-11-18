package com.github.valentinkarnaukhov.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Valentin Karnaukhov
 */
public class BookShop {

    private static Map<String, Book> bookRegistry = new HashMap<String, Book>();

    public static void main(String[] args) {
        initRegistry();
        Book book1 = bookRegistry.get("Book1").clone();
        Book book2 = bookRegistry.get("Book2").clone();
        Book book3 = bookRegistry.get("Book1").clone();
        Book book4 = bookRegistry.get("Book2").clone();
        book1.read();
        System.out.println("####");
        book2.read();
        System.out.println("####");
        book3.read();
        System.out.println("####");
        book4.read();
    }

    private static void initRegistry() {
        bookRegistry.put("Book1", new PaperBook(100, "Me", "Book1", "Soft"));
        bookRegistry.put("Book2", new EBook(100, "Me", "Book2", 2));
    }
}
