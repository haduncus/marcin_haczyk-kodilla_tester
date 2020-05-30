/*1. Interfejs Car, reprezentujący samochód, z metodami:
pobranie aktualnej prędkości samochodu – int getSpeed(),
zwiększenie prędkości – void increaseSpeed(),
zmniejszenie prędkości – void decreaseSpeed().
2. Trzy różne klasy samochodów, implementujące interfejs Car (np. Ford, Opel, itd) w różny sposób – różnica będzie polegała na tym,
o jaką wartość zwiększy / zmniejszy się wartość prędkości pojazdu po wywołaniu metod increaseSpeed() / decreaseSpeed().
Prędkość może wzrastać o inną wartość w metodzie increaseSpeed(), niż się zmniejszać w metodzie decreaseSpeed(),
ponieważ auta mogą mieć różne silniki, ale bardzo podobne hamulce.
3. Klasę CarRace z metodą main, w której utworzysz obiekty przygotowanych samochodów.
4. Metodę doRace(Car car), która na przekazanym samochodzie wywoła trzykrotnie metodę increaseSpeed() oraz dwukrotnie metodę decreaseSpeed()
i na końcu wyświetli wartość odczytaną metodą getSpeed().
W metodzie main dodaj wywołanie metody doRace() na każdym z utworzonych samochodów.*/

package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        FordMustang67 fordMustang67 = new FordMustang67(29, 10);
        doRace(fordMustang67);
        System.out.println("Ford Mustang '67: " + fordMustang67.getSpeed());
        DodgeCharger68 dodgeCharger68 = new DodgeCharger68(28, 9);
        doRace(dodgeCharger68);
        System.out.println("Dodge Charger '68: " + dodgeCharger68.getSpeed());
        ChevroletCamaro69 chevroletCamaro69 = new ChevroletCamaro69(30, 11);
        doRace(chevroletCamaro69);
        System.out.println("Chevrolet Camaro '69: " + chevroletCamaro69.getSpeed());
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
    }
}