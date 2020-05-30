/*Dodaj do niej klasę CarsListApplication z metodą main.
Wewnątrz metody main stwórz kolekcję samochodów (typu ArrayList), której typem elementów będzie dowolna klasa implementująca interfejs Car.
Dodaj do kolekcji kilka różnych samochodów i wyświetl w pętli for-each zawartość kolekcji używając przygotowanej wcześniej metody describeCar z klasy CarUtils.
Usuń jeden z samochodów z kolekcji używając do tego metody remove(int index).
Usuń jeden z samochodów z kolekcji używając do tego metody remove(Object o).
Ponownie wyświetl zawartość kolekcji, a także informację o jej rozmiarze.*/

package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.ChevroletCamaro69;
import com.kodilla.collections.interfaces.homework.DodgeCharger68;
import com.kodilla.collections.interfaces.homework.FordMustang67;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        FordMustang67 mustang1 = new FordMustang67(30, 19);
        DodgeCharger68 charger1 = new DodgeCharger68(32, 20);
        ChevroletCamaro69 camaro1 = new ChevroletCamaro69(31, 21);
        FordMustang67 mustang2 = new FordMustang67(29, 19);
        DodgeCharger68 charger2 = new DodgeCharger68(28, 15);
        ChevroletCamaro69 camaro2 = new ChevroletCamaro69(32, 17);
        FordMustang67 mustang3 = new FordMustang67(27, 20);
        DodgeCharger68 charger3 = new DodgeCharger68(24, 22);
        ChevroletCamaro69 camaro3 = new ChevroletCamaro69(34, 21);

        cars.add(mustang1);
        cars.add(charger1);
        cars.add(camaro1);
        cars.add(mustang2);
        cars.add(charger2);
        cars.add(camaro2);
        cars.add(mustang3);
        cars.add(charger3);
        cars.add(camaro3);

        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(3);
        cars.remove(mustang1);

        for (Car car : cars)
            CarUtils.describeCar(car);

        System.out.println(cars.size());
    }
}
