/*Utwórz w nim klasę StampsApplication z metodą main. Będziemy w niej tworzyli kolekcję znaczków pocztowych.
Jeżeli jakiś znaczek posiadamy w kilku egzemplarzach, to chcemy, aby w naszym obiekcie kolekcji wystąpił tylko raz.
Utwórz klasę Stamp reprezentującą znaczek pocztowy. Klasa powinna mieć pola na nazwę oraz wymiary znaczka, a także informację o tym, czy znaczek jest ostemplowany czy nie.
Wewnątrz metody main stwórz kolekcję znaczków (typu HashSet).
Sprawdź, czy do kolekcji nie da się dodać kilka razy takiego samego znaczka.*/

package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Paris", 20, 25, false));
        stamps.add(new Stamp("Berlin", 21, 24, false));
        stamps.add(new Stamp("Warsaw", 22, 26, true));
        stamps.add(new Stamp("London", 22, 22, false));
        stamps.add(new Stamp("Paris", 20, 25, false)); // duplicated stamp
        stamps.add(new Stamp("Madrid", 22, 25, true));
        stamps.add(new Stamp("Brussels", 18, 20, true));

        System.out.println("Collection size: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println("Name: " + stamp.getName() + ", size: " + stamp.getWidth() + "x" + stamp.getHeight() + " - " + stamp.getStamped());
        }
    }
}