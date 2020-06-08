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