package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.getSurfaceArea();
        rectangle.getCircumference();

        RectangularTriangle rectangularTriangle = new RectangularTriangle();
        rectangularTriangle.getSurfaceArea();
        rectangularTriangle.getCircumference();

        Square square = new Square();
        square.getSurfaceArea();
        square.getCircumference();
    }
}
