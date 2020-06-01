package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarConfigurationTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");

    @Test
    public void shouldReturnTrueIfTimeOfDayIsNight() {
        // Given
        Car car = context.getBean(Car.class);
        // When
        boolean lights = car.hasHeadlightsTurnedOn("night");
        // Then
        Assertions.assertTrue(lights);
    }

    @Test
    public void shouldReturnProperCarDependingOnSeason() {
        // Given
        CarConfiguration car = context.getBean(CarConfiguration.class);
        // When
        Car carSelect = car.rideACar();
        // Then
        Assertions.assertEquals("Sedan", carSelect.getCarType());
    }
}