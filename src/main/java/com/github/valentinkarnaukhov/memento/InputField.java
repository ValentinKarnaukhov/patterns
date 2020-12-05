package com.github.valentinkarnaukhov.memento;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Valentin Karnaukhov
 */
public class InputField {

    private final Deque<InputFieldSnapshot> history = new ArrayDeque<>();
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void typeText(String text) {
        this.history.push(new InputFieldSnapshot(this.text, this));
        this.text += text;
    }

    public List<String> getHistory() {
        return history.stream().map(InputFieldSnapshot::getLabel).collect(Collectors.toList());
    }

    public void undo() {
        if (!this.history.isEmpty()) {
            this.history.poll().restore();
        }
    }

    @Override
    public String toString() {
        return text;
    }
}
