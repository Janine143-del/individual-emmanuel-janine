package com.joysistvi.day22;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Jayce", 15000),
                new SalesEmployee("Bea", 12000, 5000),
                new ContractualEmployee("Lester", 160, 75)
        };

        for (Employee e : employees) {
            e.printPayslip();

            if (e instanceof Bonusable) {
                Bonusable b = (Bonusable) e;
                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }

            if (e instanceof Auditable) {
                Auditable a = (Auditable) e;
                a.logSalaryComputation(a.generateEmployeeId());
            }

            System.out.println("===============================");
        }
    }
}