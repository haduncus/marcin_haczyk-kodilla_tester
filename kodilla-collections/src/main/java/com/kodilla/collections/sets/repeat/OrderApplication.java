package com.kodilla.collections.sets.repeat;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2020", "Lamp", 3));
        orders.add(new Order("2/2020", "Laptop", 1));
        orders.add(new Order("3/2020", "Monitor", 2));
        orders.add(new Order("1/2020", "Lamp", 3));

        System.out.println(orders.size());

        for(Order order : orders) {
            System.out.println(order);
        }
    }

}
