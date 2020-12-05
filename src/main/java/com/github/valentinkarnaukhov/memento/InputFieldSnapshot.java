package com.github.valentinkarnaukhov.memento;

import java.time.LocalTime;
import java.util.Date;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * @author Valentin Karnaukhov
 */
public class InputFieldSnapshot {

    private final String text;
    private final InputField inputField;
    private final String name;
    private final LocalTime date;

    public InputFieldSnapshot(String text, InputField inputField) {
        this.text = text;
        this.inputField = inputField;
        this.name = UUID.randomUUID().toString();
        this.date = LocalTime.now();
    }

    public void restore() {
        this.inputField.setText(text);
    }

    public String getLabel() {
        return name + "(" + date + ")";
    }
}
