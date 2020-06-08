package com.kodilla.collections.interfaces.homework;

public class FordMustang67 implements Car {

    private int speed;
    private int plusSpeed;
    private int minusSpeed;

    public FordMustang67(int plusSpeed, int minusSpeed) {
        this.plusSpeed = plusSpeed;
        this.minusSpeed = minusSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = (int) ((speed * 1.25) + plusSpeed);
    }

    @Override
    public void decreaseSpeed() {
        speed = (int) ((speed * 1.4) - minusSpeed);
    }
}