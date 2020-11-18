package com.github.valentinkarnaukhov.adapter;

import java.util.Arrays;

/**
 * @author Valentin Karnaukhov
 */
public class Office {

    public static void main(String[] args) {
        Printer printer = new Printer();
        PaperReport paperReport = new PaperReport("It's paper report");
        DigitalReport digitalReport = new DigitalReport(Arrays.asList("It's", "digital", "report"));
        DigitalReportAdapter digitalReportAdapter = new DigitalReportAdapter(digitalReport);
        printer.printReport(paperReport);
        printer.printReport(digitalReportAdapter);
    }
}
