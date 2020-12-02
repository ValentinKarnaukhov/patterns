package com.github.valentinkarnaukhov.mediator;

/**
 * @author Valentin Karnaukhov
 */
public class JobStatusCheckbox {

    private final Mediator mediator;
    private boolean isHasJob;

    public JobStatusCheckbox(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setHasJob(boolean hasJob) {
        isHasJob = hasJob;
        mediator.notify(this, "edited");
    }

    public boolean isHasJob() {
        return isHasJob;
    }
}
