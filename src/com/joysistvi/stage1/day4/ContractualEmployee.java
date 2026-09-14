package com.joysistvi.stage1.day4;

public class ContractualEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}
