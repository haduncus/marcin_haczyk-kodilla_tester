package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orderList = new ArrayList<>();

    public void addNewOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrderList() {         // Nie wiedziałem jak odwołać się do prywatnej zmiennej z zewnętrznej klasy, więc stworzyłem publiczną metodę zwracającą tę zmienną
        return this.orderList;
    }

    public List<Order> getOrderListForSpecificDateRange(LocalDate from, LocalDate to) {
        return this.orderList
                .stream()
                .filter(o -> o.getOrderDate().isAfter(from) && o.getOrderDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderListForSpecificValueRange(double minValue, double maxValue) {
        return this.orderList
                .stream()
                .filter(o -> o.getOrderValue() >= minValue && o.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getNumberOfOrders() {
        return this.orderList.size();
    }

    public double getSumOfOrders() {
        double sumOfOrder = 0;
        for (Order value : orderList) {
            sumOfOrder += value.getOrderValue();
        }
        return sumOfOrder;
    }
}