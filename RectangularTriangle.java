package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape {
    public RectangularTriangle() {
        super(6, 4);
    }

    @Override
    public void getSurfaceArea() {
        System.out.println((super.getBaseLength() * super.getHeight()) / 2);
    }

    @Override
    public void getCircumference() {
        System.out.println(Math.hypot(super.getHeight(), super.getBaseLength()) + super.getBaseLength() + super.getHeight());
    }
}