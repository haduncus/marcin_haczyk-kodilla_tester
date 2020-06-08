package com.kodilla.abstracts.homework;

public class MechanicalConstructor extends Job {

    public MechanicalConstructor() {
        super(4500, "Projektowanie zaawansowanych technicznie maszyn – wyważarek i systemów diagnostycznych.");
    }

    @Override
    public void giveSalary() {
        System.out.println(this.getSalary());
        this.getSalary();
    }

    @Override
    public void giveResponsibilities() {
        System.out.println(this.getResponsibilities());
        this.getResponsibilities();
    }
}