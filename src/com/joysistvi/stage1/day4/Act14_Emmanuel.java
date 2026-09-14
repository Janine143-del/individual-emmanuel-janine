package com.joysistvi.stage1.day4;

public class Act14_Emmanuel {
    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Ja", 20000),
                new SalesEmployee("Bea", 6000, 7000),
                new ContractualEmployee("Manuel", 160, 75)
        };

        for (Employee e : employees) {
            e.printPayslip();
        }
    }
}1`
