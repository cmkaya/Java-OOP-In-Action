package com.cemkaya;

public class LoanCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;
    private float monthlyInterest;
    private short totalMonths;

    public LoanCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMonthlyPayment() {
        return (principal * getMonthlyInterest())
                / (1 - Math.pow(1 + getMonthlyInterest(), - getTotalMonths()));
    }

    public double calculateTotalLoanCost() {
        return getMonthlyInterest() * principal * getTotalMonths()
                / (1 - Math.pow(1 + getMonthlyInterest(), -getTotalMonths()));
    }

    private short getTotalMonths() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
