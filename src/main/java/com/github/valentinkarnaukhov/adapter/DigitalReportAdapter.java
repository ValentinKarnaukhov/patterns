package com.github.valentinkarnaukhov.adapter;


/**
 * @author Valentin Karnaukhov
 */
public class DigitalReportAdapter extends PaperReport {

    private DigitalReport digitalReport;

    private DigitalReportAdapter(){ }

    public DigitalReportAdapter(DigitalReport digitalReport) {
        this.digitalReport = digitalReport;
    }

    @Override
    public String getContent() {
        return String.join(" ", digitalReport.getContent());
    }
}
