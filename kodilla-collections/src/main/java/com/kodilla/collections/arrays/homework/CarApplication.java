package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.ChevroletCamaro69;
import com.kodilla.collections.interfaces.homework.DodgeCharger68;
import com.kodilla.collections.interfaces.homework.FordMustang67;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();

        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int increase = random.nextInt(20) + 30;
        int decrease = random.nextInt(20) + 30;

        if (drawCarKind == 0)
            return new FordMustang67(increase, decrease);
        else if (drawCarKind == 1)
            return new DodgeCharger68(increase, decrease);
        else
            return new ChevroletCamaro69(increase, decrease);
    }
}