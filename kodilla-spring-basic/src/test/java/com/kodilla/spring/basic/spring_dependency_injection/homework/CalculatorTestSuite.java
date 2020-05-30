package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnProperValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display bean = context.getBean(Display.class);
        String value = bean.display(9);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldReturnProperResultOfAddOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.add(14.1, 72.2);
        Assertions.assertEquals("Result of operation: 86.3", result);
    }

    @Test
    public void shouldReturnProperResultOfSubtractOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.subtract(80.5, 32.3);
        Assertions.assertEquals("Result of operation: 48.2", result);
    }

    @Test
    public void shouldReturnProperResultOfMultiplyOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.multiply(4.2, 8.1);
        Assertions.assertEquals("Result of operation: 34.02", result);
    }

    @Test
    public void shouldReturnProperResultOfDivideOperation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.divide(16.6, 2);
        Assertions.assertEquals("Result of operation: 8.3", result);
    }

    @Test
    public void shouldReturnNullResultOfDivideByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        String result = bean.divide(16.6, 0);
        Assertions.assertNull(result);
    }
}