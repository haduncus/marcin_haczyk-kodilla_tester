package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> order = orderList
                .stream()
                .filter(o -> o.getNumber().contains(number))
                .collect(Collectors.toList());
        if (!order.isEmpty()) {                                                         // in the List should be only one object (if order number is on the list)
            if (order.get(0).getNumber().equals(number)) {                              // protection in case if 0 index will be something different (bug)
                return order.get(0);
            }
        }
        throw new OrderDoesntExistException();
    }
}
