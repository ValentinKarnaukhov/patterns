package com.github.valentinkarnaukhov.mediator;

/**
 * @author Valentin Karnaukhov
 */
public class ExperienceSelector {

    private final Mediator mediator;
    private int duration;

    public ExperienceSelector(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setDuration(int duration) {
        this.duration = duration;
        mediator.notify(this, "edited");
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "ExperienceSelector{" +
                ", duration=" + duration +
                '}';
    }
}
