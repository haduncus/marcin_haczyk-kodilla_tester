package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double orderValue;
    private LocalDate orderDate;
    private String consumerLogin;

    public Order(double orderValue, LocalDate orderDate, String consumerLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.consumerLogin = consumerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getConsumerLogin() {
        return consumerLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", consumerLogin='" + consumerLogin + '\'' +
                '}';
    }
}