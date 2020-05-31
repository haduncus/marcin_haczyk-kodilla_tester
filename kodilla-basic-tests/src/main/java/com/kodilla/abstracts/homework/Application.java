/*1. Utwórz abstrakcyjną klasę Shape z dwiema abstrakcyjnymi metodami obliczającym pole powierzchni i obwód.
Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją. Działanie zaprezentuj w klasie Application.
2. Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
Utwórz kilka konkretnych zawodów (klas dziedziczących po Job). W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.*/

package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.getSurfaceArea();
        rectangle.getCircuit();

        RectangularTriangle rectangularTriangle = new RectangularTriangle();
        rectangularTriangle.getSurfaceArea();
        rectangularTriangle.getCircuit();

        Square square = new Square();
        square.getSurfaceArea();
        square.getCircuit();


    }
}
