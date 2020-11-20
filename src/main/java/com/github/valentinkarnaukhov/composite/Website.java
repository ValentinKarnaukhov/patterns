package com.github.valentinkarnaukhov.composite;

/**
 * @author Valentin Karnaukhov
 */
public class Website {

    public static void main(String[] args) {
        HtmlElement header = new Div("kinda header");
        header.add(new Link("Social networks links"));
        HtmlElement body = new Div("kinda body");
        body.add(new Div("First article"));
        body.add(new Div("Second article"));
        body.add(new Div("Third article"));
        HtmlElement footer = new Div("kinda footer");
        footer.add(new Link("powered by Valentin Karnaukhov"));
        HtmlElement html = new Div("kinda html");
        html.add(header);
        html.add(body);
        html.add(footer);

        html.draw();
    }

}
