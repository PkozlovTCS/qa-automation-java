package com.tinkoff.edu.app;

public class LoanRequest {
    private final LoanType type;
    private final int months;
    private final double amount;

    public LoanRequest(LoanType type, int months, double amount) {
        this.type = type;
        this.months = months;
        this.amount = amount;
    }

    public int getMonths() {
        return months;
    }

    public double getAmount() {
        return amount;
    }

    public LoanType getType() {
        return type;
    }

    public String toString() {
        return this.getAmount() + " for " + this.getMonths() + " " + this.type;
    }

}
