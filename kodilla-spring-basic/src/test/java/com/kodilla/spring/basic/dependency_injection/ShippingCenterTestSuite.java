/*
package com.kodilla.spring.basic.dependency_injection;

import com.kodilla.spring.basic.dependency_injection.homework.NotificationService;
import com.kodilla.spring.basic.dependency_injection.homework.ShippingCenter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    NotificationService bean = null;

    @Test
    public void shouldReturnCorrectMessageWhenSuccess() {

        String message = bean.success("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectMessageWhenFail() {

        String message = bean.fail("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldDeliverProperWeightPackage() {

        String message = bean.sendPackage("Warsaw", 16.5);
        Assertions.assertEquals("Package delivered to: Warsaw", message);
    }

    @Test
    public void shouldNotDeliverOverweightPackage() {

        String message = bean.sendPackage("Warsaw", 30.1);
        Assertions.assertEquals("Package not delivered to: Warsaw", message);
    }

    @BeforeEach
    public void createContextAndBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        bean = context.getBean(NotificationService.class);

    }
}*/
