package com.joysistvi.day22;

public class SalesEmployee extends Employee implements Bonusable {
    private static final double TAX_RATE = 0.12;
    private double commission; // Field needed for commission

    // This must accept 3 arguments:
    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return commission * 0.10;
    }

    @Override
    public boolean isEligibleForBonus() {
        return commission > 0;
    }
}