package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4, 3);
    }

    @Override
    public void getSurfaceArea() {
        System.out.println(super.getBaseLength() * super.getHeight());
    }

    @Override
    public void getCircumference() {
        System.out.println(2 * (super.getBaseLength() + super.getHeight()));
    }
}
