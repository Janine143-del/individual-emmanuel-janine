package com.joysistvi.day22;

public class ContractualEmployee extends Employee implements Auditable {
    private int hoursWorked;
    private double hourlyRate;
    private static final double TAX_Rate = 0.05; // Note: matches 5% deduction rule

    public ContractualEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked * hourlyRate); // Passing total calculated base or handling fields
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return this.hoursWorked * this.hourlyRate;
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_Rate;
    }

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public String generateEmployeeId() {
        return "CON-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println("Audit log: " + employeeId + " salary computed.");
    }
}