package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public String add(double a, double b) {
        double result = a + b;
        return display.display(result);
    }

    public String subtract(double a, double b) {
        double result = a - b;
        return display.display(result);
    }

    public String multiply(double a, double b) {
        double result = a * b;
        return display.display(result);
    }

    public String divide(double a, double b) {
        if (divisorValidator(b)) {
            double result = a / b;
            return display.display(result);
        }
        return null;
    }

    private boolean divisorValidator(double b) {
        return b != 0;
    }
}