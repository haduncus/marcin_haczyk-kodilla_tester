package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int operatingSystemReleaseYear;

    public OperatingSystem(int operatingSystemReleaseYear) {
        this.operatingSystemReleaseYear = operatingSystemReleaseYear;
    }

    public void turnOn() {
        System.out.println("Play default turn on sound");
    }
    public void turnOff() {
        System.out.println("Play default turn off sound");
    }

    public int getOperatingSystemReleaseYear() {
        return operatingSystemReleaseYear;
    }
}