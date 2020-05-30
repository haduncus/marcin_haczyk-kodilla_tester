package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectMessageWhenSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectMessageWhenFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldDeliverProperWeightPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 16.5);
        Assertions.assertEquals("Package delivered to: Warsaw", message);
    }

    @Test
    public void shouldNotDeliverOverweightPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 30.1);
        Assertions.assertEquals("Package not delivered to: Warsaw", message);
    }
}