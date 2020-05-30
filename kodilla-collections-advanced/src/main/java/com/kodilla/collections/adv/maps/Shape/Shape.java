package com.kodilla.collections.adv.maps.Shape;

public abstract class Shape {
    private int baseLength;

    public Shape(int baseLength) {
        this.baseLength = baseLength;
    }

    public abstract int getAreaSurface();

    public int getBaseLength() {
        return baseLength;
    }
}
