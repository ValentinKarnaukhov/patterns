package com.github.valentinkarnaukhov.mediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Valentin Karnaukhov
 */
public class CVMediator implements Mediator {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final ApplyButton applyButton = new ApplyButton(this);
    private final ExperienceSelector experienceSelector = new ExperienceSelector(this);
    private final JobStatusCheckbox jobStatusCheckBox = new JobStatusCheckbox(this);

    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof JobStatusCheckbox) {
            if (((JobStatusCheckbox) sender).isHasJob()) {
                System.out.println("Enter you previous experience duration:");
                try {
                    String duration = reader.readLine();
                    experienceSelector.setDuration(Integer.parseInt(duration));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (sender instanceof ExperienceSelector) {
            System.out.println("Value was changed to: " + ((ExperienceSelector) sender).getDuration());
        } else if (sender instanceof ApplyButton) {
            System.out.println(this.toString());
        }
    }

    public ApplyButton getApplyButton() {
        return applyButton;
    }

    public ExperienceSelector getExperienceSelector() {
        return experienceSelector;
    }

    public JobStatusCheckbox getJobStatusCheckBox() {
        return jobStatusCheckBox;
    }

    @Override
    public String toString() {
        return experienceSelector.toString();
    }
}
