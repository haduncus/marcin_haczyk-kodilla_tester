package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(9.3, LocalDate.of(2020, 7, 1), "User1");
    Order order2 = new Order(3.9, LocalDate.of(2020, 5, 20), "User2");
    Order order3 = new Order(5.3, LocalDate.of(2020, 6, 30), "User3");
    Order order4 = new Order(15.0, LocalDate.of(2020, 4, 30), "User3");
    Order order5 = new Order(7.4, LocalDate.of(2020, 6, 1), "User3");
    Order order6 = new Order(7.7, LocalDate.of(2020, 6, 4), "User3");

    @Test
    public void calculateNumberOfOrders() {
        // When
        int numberOfOrders = shop.getNumberOfOrders();
        // Then
        assertEquals(6, numberOfOrders);
    }

    @Test
    public void shouldReturnFirstAndLastItemFromOrderList() {
        // When
        Order first = shop.getOrderList().get(0);
        Order last = shop.getOrderList().get(shop.getNumberOfOrders() - 1);
        // Then
        assertEquals(first, order1);
        assertEquals(last, order6);
    }

    @Test
    public void shouldReturnProperSizeOfOrderListInDateRange() {
        // When
        int listSize = shop.getOrderListForSpecificDateRange(LocalDate.of(2020, 5, 15), LocalDate.of(2020, 6, 20)).size();
        // Then
        assertEquals(3, listSize);
    }

    @Test
    public void shouldReturnFirstAndLastItemFromOrderListInDateRange() {
        // When
        List<Order> dateRangeList = shop.getOrderListForSpecificDateRange(LocalDate.of(2020, 5, 15), LocalDate.of(2020, 6, 20));
        Order first = dateRangeList.get(0);
        Order last = dateRangeList.get(dateRangeList.size() - 1);
        // Then
        assertEquals(first, order2);
        assertEquals(last, order6);
    }

    @Test
    public void shouldReturnProperSizeOfOrderListInValueRange() {
        // When
        int listSize = shop.getOrderListForSpecificValueRange(4.5, 8.5).size();
        // Then
        assertEquals(3, listSize);
    }

    @Test
    public void shouldReturnFirstAndLastItemFromOrderListInValueRange() {
        // When
        List<Order> dateRangeList = shop.getOrderListForSpecificValueRange(4.5, 8.5);
        Order first = dateRangeList.get(0);
        Order last = dateRangeList.get(dateRangeList.size() - 1);
        // Then
        assertEquals(first, order3);
        assertEquals(last, order6);
    }

    @Test
    public void shouldCalculateTotalSumOfOrders() {
        // When
        double sumOfOrders = shop.getSumOfOrders();
        // Then
        assertEquals(48.6, sumOfOrders);
    }

    @BeforeEach
    public void createOrderList() {
        shop.addNewOrder(order1);
        shop.addNewOrder(order2);
        shop.addNewOrder(order3);
        shop.addNewOrder(order4);
        shop.addNewOrder(order5);
        shop.addNewOrder(order6);
    }
}