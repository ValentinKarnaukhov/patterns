package com.github.valentinkarnaukhov.strategy;

/**
 * @author Valentin Karnaukhov
 */
public class AuditCompany {

    public void doAudit(Company company) {
        TaxStrategy strategy;
        if (company.getIncome() >= 150_000_000) {
            strategy = new NDSStrategy();
        } else {
            strategy = new USNStrategy();
        }
        long tax = strategy.calculateTax(company.getIncome());
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args) {
        AuditCompany auditCompany = new AuditCompany();
        Company company = new Company();
        company.addIncome(100_000_000);
        auditCompany.doAudit(company);
        company.addIncome(50_000_000);
        auditCompany.doAudit(company);
    }
}
