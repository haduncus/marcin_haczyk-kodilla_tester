package com.kodilla.inheritance.homework;

public class WindowsVista extends OperatingSystem {
    public WindowsVista(int operatingSystemReleaseYear) {
        super(operatingSystemReleaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Play Windows Vista on sound");
    }

    @Override
    public void turnOff() {
        System.out.println("Play Windows Vista off sound");
    }
}