package com.kodilla.exception.homework;

import org.junit.Test;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.getOrder("Not existing order");
    }
}