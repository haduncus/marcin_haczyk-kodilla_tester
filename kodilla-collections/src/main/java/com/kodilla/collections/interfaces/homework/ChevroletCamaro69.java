package com.kodilla.collections.interfaces.homework;

public class ChevroletCamaro69 implements Car {

    private int speed;
    private int plusSpeed;
    private int minusSpeed;

    public ChevroletCamaro69(int plusSpeed, int minusSpeed) {
        this.plusSpeed = plusSpeed;
        this.minusSpeed = minusSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = (int) ((speed * 1.4) + plusSpeed);
    }

    @Override
    public void decreaseSpeed() {
        speed = (int) ((speed * 1.3) - minusSpeed);
    }
}
