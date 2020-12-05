package com.github.valentinkarnaukhov.memento;

/**
 * @author Valentin Karnaukhov
 */
public class TextEditor {

    public static void main(String[] args) {
        InputField inputField = new InputField();
        inputField.typeText("First operation\n");
        inputField.typeText("Second operation\n");
        inputField.typeText("Third operation\n");

        inputField.getHistory().forEach(System.out::println);
        System.out.println(inputField);
        inputField.undo();
        System.out.println(inputField);
        inputField.undo();
        System.out.println(inputField);
        inputField.undo();
        System.out.println(inputField);
    }
}
