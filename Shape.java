package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int baseLength;
    private int height;

    public Shape(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public int getBaseLength() {
        return baseLength;
    }

    public int getHeight() {
        return height;
    }

    public abstract void getSurfaceArea();

    public abstract void getCircumference();
}