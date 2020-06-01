/*
package com.kodilla.bank.homework;

import org.junit.Assert;
import org.junit.Test;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getOperations();
        Assert.assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(50);
        cashMachine.addOperation(-25);

        int[] values = cashMachine.getOperations();
        Assert.assertEquals(2, values.length);
        Assert.assertEquals(50, values[0]);
        Assert.assertEquals(-25, values[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-70);

        int balance = cashMachine.getBalance();
        Assert.assertEquals(260, balance);
    }

    @Test
    public void shouldReturnNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(210);
        cashMachine.addOperation(-70);

        int deposits = cashMachine.getNumberOfDeposits();
        Assert.assertEquals(2, deposits);
    }

    @Test
    public void shouldReturnNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(-70);
        cashMachine.addOperation(-90);

        int withdraws = cashMachine.getNumberOfWithdraws();
        Assert.assertEquals(2, withdraws);
    }

    @Test
    public void shouldCalculateAverageOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(210);
        cashMachine.addOperation(-70);

        double avgDeposits = cashMachine.getAverageOfDeposits();
        Assert.assertEquals(220, avgDeposits);
    }

    @Test
    public void shouldCalculateAverageOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(-90);
        cashMachine.addOperation(-70);

        double avgWithdraws = cashMachine.getAverageOfWithdraws();
        Assert.assertEquals(-80, avgWithdraws);
    }
}*/
