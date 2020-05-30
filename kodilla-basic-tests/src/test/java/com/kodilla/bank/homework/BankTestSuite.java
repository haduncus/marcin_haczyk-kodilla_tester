package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();

        int[] depositTransactions = bank.getDepositTransactions();
        assertEquals(0, depositTransactions.length);

        int[] withdrawTransactions = bank.getWithdrawTransactions();
        assertEquals(0, withdrawTransactions.length);
    }

    @Test
    public void shouldCalculateAverageValueOfDeposit() {
        Bank bank = new Bank();
        bank.addDeposit(60);
        bank.addDeposit(130);
        int totalBalance = bank.getDepositAverage();
        assertEquals(95, totalBalance);
    }

    @Test
    public void shouldCalculateAverageValueOfWithdraw() {
        Bank bank = new Bank();
        bank.addWithdraw(30);
        bank.addWithdraw(60);
        int totalBalance = bank.getWithdrawAverage();
        assertEquals(45, totalBalance);
    }

    @Test
    public void shouldCalculateTotalNumberOfDeposit() {
        Bank bank = new Bank();
        bank.addDeposit(60);
        bank.addDeposit(130);
        int totalNumberOfDeposit = bank.getTotalNumberOfDeposit();
        assertEquals(2, totalNumberOfDeposit);
    }

    @Test
    public void shouldCalculateTotalNumberOfWithdraw() {
        Bank bank = new Bank();
        bank.addWithdraw(500);
        bank.addWithdraw(250);
        bank.addWithdraw(130);
        int totalNumberOfWithdraw = bank.getTotalNumberOfWithdraw();
        assertEquals(3, totalNumberOfWithdraw);
    }

    @Test
    public void shouldReturnTotalBalance() {
        Bank bank = new Bank();
        bank.addDeposit(500);
        bank.addWithdraw(260);
        int totalBalance = bank.getTotalBalance();
        assertEquals(240, totalBalance);
    }
}