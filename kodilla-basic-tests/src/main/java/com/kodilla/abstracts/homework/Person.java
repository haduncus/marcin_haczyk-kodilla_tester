package com.kodilla.abstracts.homework;

public class Person {

    public static void main(String[] args) {
        Job mechanicalConstructor = new MechanicalConstructor();
        Person john = new Person(mechanicalConstructor, "John", 35);
        System.out.println(john.age + " years old " + john.firstName + " earns " + john.job.getSalary() + " dollars and his responsibility is " + john.job.getResponsibilities());
    }

    private Job job;
    private String firstName;
    private int age;

    public Person(Job job, String firstName, int age){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


}