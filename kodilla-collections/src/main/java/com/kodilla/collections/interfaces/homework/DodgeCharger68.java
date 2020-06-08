package com.kodilla.collections.interfaces.homework;

public class DodgeCharger68 implements Car {

    private int speed;
    private int plusSpeed;
    private int minusSpeed;

    public DodgeCharger68(int plusSpeed, int minusSpeed) {
        this.plusSpeed = plusSpeed;
        this.minusSpeed = minusSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = (int) ((speed * 1.3) + plusSpeed);
    }

    @Override
    public void decreaseSpeed() {
        speed = (int) ((speed * 1.4) - minusSpeed);
    }
}