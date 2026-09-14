package com.joysistvi.stage1.day4;

public class RegularEmployee extends Employee{
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + 1000.0;
    }
}
