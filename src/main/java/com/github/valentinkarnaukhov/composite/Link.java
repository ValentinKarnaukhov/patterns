package com.github.valentinkarnaukhov.composite;

/**
 * @author Valentin Karnaukhov
 */
public class Link implements HtmlElement {

    private final String content;

    public Link(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("<a href=hello>"+content+"</a>");
    }

    @Override
    public void add(HtmlElement htmlElement) {

    }
}
