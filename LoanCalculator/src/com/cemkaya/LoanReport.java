package com.cemkaya;

import java.util.Locale;

public class LoanReport {
    private LoanCalculator loanCalculator;
    private Locale locale;

    public LoanReport(LoanCalculator loanCalculator, Locale locale) {

        this.loanCalculator = loanCalculator;
        this.locale = locale;
    }

    public void printMonthlyPayment() {
        double monthlyPayment = loanCalculator.calculateMonthlyPayment();
        String formattedMonthlyPayment = Util.convertCurrency(monthlyPayment, locale);
        System.out.println("Monthly Payment: " + formattedMonthlyPayment);
    }

    public void printTotalCost() {
        double totalBalance = loanCalculator.calculateTotalLoanCost();
        String formattedTotalBalance = Util.convertCurrency(totalBalance, locale);
        System.out.println("Total Cost of Loan: " + formattedTotalBalance);
    }
}
