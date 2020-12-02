package com.github.valentinkarnaukhov.mediator;

/**
 * @author Valentin Karnaukhov
 */
public class Hiring {

    public static void main(String[] args) {
        CVMediator cvMediator = new CVMediator();

        cvMediator.getJobStatusCheckBox().setHasJob(true);
        cvMediator.getApplyButton().onClick();

        cvMediator.getJobStatusCheckBox().setHasJob(false);
        cvMediator.getApplyButton().onClick();
    }
}
