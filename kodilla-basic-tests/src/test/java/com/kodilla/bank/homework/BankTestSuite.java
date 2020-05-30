package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnZeroWithoutOperations() {
        Bank bank = new Bank();

        int noOperations = bank.getTotalBalance();
        assertEquals(0, noOperations);
    }

    @Test
    public void shouldReturnZeroIfOperationsAreNotDividedBy20() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(0);
        bank.addCashMachine2Operation(185);
        bank.addCashMachine3Operation(-30);

        int totalBalance = bank.getTotalBalance();
        assertEquals(0, totalBalance);
    }

    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(40);
        bank.addCashMachine2Operation(-180);
        bank.addCashMachine3Operation(400);

        int totalBalance = bank.getTotalBalance();
        assertEquals(260, totalBalance);
    }

    @Test
    public void shouldReturnTotalNumberOfDeposits() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(40);
        bank.addCashMachine2Operation(-180);
        bank.addCashMachine3Operation(400);

        int totalNumberOfDeposits = bank.getTotalNumberOfDeposits();
        assertEquals(2, totalNumberOfDeposits);
    }

    @Test
    public void shouldReturnTotalNumberOfWithdraws() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(400);
        bank.addCashMachine2Operation(-120);
        bank.addCashMachine3Operation(-240);

        int totalNumberOfWithdraws = bank.getTotalNumberOfWithdraws();
        assertEquals(2, totalNumberOfWithdraws);
    }

    @Test
    public void shouldCalculateTotalAverageOfDeposits() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(200);
        bank.addCashMachine2Operation(300);
        bank.addCashMachine2Operation(200);
        bank.addCashMachine3Operation(-60);

        double totalAverageOfDeposits = bank.getTotalAverageOfDeposits();
        assertEquals(233.33, totalAverageOfDeposits, 0.01);
    }

    @Test
    public void shouldCalculateTotalAverageOfWithdraws() {
        Bank bank = new Bank();

        bank.addCashMachine1Operation(200);
        bank.addCashMachine2Operation(-200);
        bank.addCashMachine2Operation(-260);
        bank.addCashMachine3Operation(-100);

        double totalAverageOfWithdraws = bank.getTotalAverageOfWithdraws();
        assertEquals(-186.67, totalAverageOfWithdraws, 0.01);
    }
}