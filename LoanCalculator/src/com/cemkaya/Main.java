package com.cemkaya;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 10_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual interest: ", 1, 40);
        byte years = (byte) Console.readNumber("Period: ", 1, 30);

        var loanCalculator = new LoanCalculator(principal, annualInterest, years);
        var loanReport = new LoanReport(loanCalculator, new Locale("en", "US"));
        loanReport.printMonthlyPayment();
        loanReport.printTotalCost();
    }
}