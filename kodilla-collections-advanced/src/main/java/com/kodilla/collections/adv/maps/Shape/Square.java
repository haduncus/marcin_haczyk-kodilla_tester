package com.kodilla.collections.adv.maps.Shape;

public class Square extends Shape {
    public Square(int baseLength) {
        super(baseLength);
    }

    @Override
    public int getAreaSurface() {
        return this.getBaseLength()*this.getBaseLength();
    }
}
