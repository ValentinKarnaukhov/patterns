package com.github.valentinkarnaukhov.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Valentin Karnaukhov
 */
public class Div implements HtmlElement {

    private final String content;
    private List<HtmlElement> children = new ArrayList<>();

    public Div(String content) {
        this.content = content;
    }

    @Override
    public void draw() {
        System.out.println("<div>" + content);
        children.forEach(HtmlElement::draw);
        System.out.println("</div>");
    }

    @Override
    public void add(HtmlElement htmlElement) {
        children.add(htmlElement);
    }
}
