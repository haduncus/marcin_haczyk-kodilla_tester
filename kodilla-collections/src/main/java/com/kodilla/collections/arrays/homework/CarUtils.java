package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.ChevroletCamaro69;
import com.kodilla.collections.interfaces.homework.DodgeCharger68;
import com.kodilla.collections.interfaces.homework.FordMustang67;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-------------------------------------");
        System.out.println("Car: " + getCarName(car));
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof FordMustang67)
            return "Ford Mustang '67";
        else if (car instanceof ChevroletCamaro69)
            return "Chevrolet Camaro '69";
        else if (car instanceof DodgeCharger68)
            return "Dodge Charger '68";
        else
            return "Unknown car name";
    }
}