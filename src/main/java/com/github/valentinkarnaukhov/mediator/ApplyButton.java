package com.github.valentinkarnaukhov.mediator;

/**
 * @author Valentin Karnaukhov
 */
public class ApplyButton {

    private final Mediator mediator;

    public ApplyButton(Mediator mediator) {
        this.mediator = mediator;
    }

    public void onClick(){
        mediator.notify(this, "click");
    }

}
