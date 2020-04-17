// W nowym pakiecie com.kodilla.inheritance.homework utwórz klasę OperatingSystem.
// Utwórz metody turnOn(), turnOff() oraz konstruktor przyjmujący rok wydania danego systemu operacyjnego.
// Następnie dodaj dwie klasy dziedziczące po OperatingSystem nadpisujące metody z klasy wyżej. Utwórz osobną klasę, w której zaprezentujesz działanie Twojego kodu.

package com.kodilla.inheritance.homework;

public class ApplicationOS {
    public static void main(String[] args) {
        OperatingSystem defaultOperatingSystem = new OperatingSystem(1999);
        defaultOperatingSystem.turnOn();
        defaultOperatingSystem.turnOff();
        WindowsXP winXP = new WindowsXP(2001);
        winXP.displayWinXpLogo();
        winXP.turnOn();
        winXP.turnOff();
        WindowsVista winVista = new WindowsVista(2007);
        winVista.turnOn();
        winVista.turnOff();
    }
}