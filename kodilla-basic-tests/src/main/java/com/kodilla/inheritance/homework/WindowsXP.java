package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {
    public WindowsXP(int operatingSystemReleaseYear) {
        super(operatingSystemReleaseYear);
    }

    public void displayWinXpLogo() {
        System.out.println("Display Windows XP logo");
    }

    @Override
    public void turnOn() {
        System.out.println("Play Windows XP on sound");
    }

    @Override
    public void turnOff() {
        System.out.println("Play Windows XP off sound");
    }
}