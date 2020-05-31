package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldReturnDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        Clock beanFirst = context.getBean(Clock.class);
        Clock beanSecond = context.getBean(Clock.class);
        Clock beanThird = context.getBean(Clock.class);
        Assertions.assertNotEquals(beanFirst, beanSecond);
        Assertions.assertNotEquals(beanSecond, beanThird);
        Assertions.assertNotEquals(beanFirst, beanThird);
    }
}