package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(5, 5);
    }

    @Override
    public void getSurfaceArea() {
        if (getBaseLength() != getHeight()) {
            System.out.println("Height have to be equal to the base length!");
        } else {
            System.out.println(getBaseLength() * getHeight());
        }
    }

    @Override
    public void getCircumference() {
        if (getBaseLength() != getHeight()) {
            System.out.println("Height have to be equal to the base length!");
        } else {
            System.out.println(4 * getBaseLength());
        }
    }
}
