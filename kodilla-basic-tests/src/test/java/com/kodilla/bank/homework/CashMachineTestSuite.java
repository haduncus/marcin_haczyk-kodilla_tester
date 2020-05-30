package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        int[] values = cashMachine.getOperations();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(50);
        cashMachine.addOperation(-25);

        int[] values = cashMachine.getOperations();
        assertEquals(2, values.length);
        assertEquals(50, values[0]);
        assertEquals(-25, values[1]);
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(100);
        cashMachine.addOperation(-70);

        int balance = cashMachine.getBalance();
        assertEquals(260, balance);
    }

    @Test
    public void shouldReturnNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(210);
        cashMachine.addOperation(-70);

        int deposits = cashMachine.getNumberOfDeposits();
        assertEquals(2, deposits);
    }

    @Test
    public void shouldReturnNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(-70);
        cashMachine.addOperation(-90);

        int withdraws = cashMachine.getNumberOfWithdraws();
        assertEquals(2, withdraws);
    }

    @Test
    public void shouldCalculateAverageOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(210);
        cashMachine.addOperation(-70);

        double avgDeposits = cashMachine.getAverageOfDeposits();
        assertEquals(220,avgDeposits);
    }

    @Test
    public void shouldCalculateAverageOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(230);
        cashMachine.addOperation(-90);
        cashMachine.addOperation(-70);

        double avgWithdraws = cashMachine.getAverageOfWithdraws();
        assertEquals(-80,avgWithdraws);
    }
}