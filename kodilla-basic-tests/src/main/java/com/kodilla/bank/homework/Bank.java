package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank() {
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
    }

    public void addCashMachine1Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine1.addOperation(money);
        }
    }

    public void addCashMachine2Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine2.addOperation(money);
        }
    }

    public void addCashMachine3Operation(int money) {
        if (money % 20 == 0) {
            this.cashMachine3.addOperation(money);
        }
    }

    public int getCashMachine1Balance() {
        return this.cashMachine1.getBalance();
    }

    public int getCashMachine2Balance() {
        return this.cashMachine2.getBalance();
    }

    public int getCashMachine3Balance() {
        return this.cashMachine3.getBalance();
    }

    public int getTotalBalance() {
        int totalBalance = getCashMachine1Balance() + getCashMachine2Balance() + getCashMachine3Balance();
        return totalBalance;
    }

    public int getTotalNumberOfDeposits() {
        int deposit = this.cashMachine1.getNumberOfDeposits() + this.cashMachine2.getNumberOfDeposits() + this.cashMachine3.getNumberOfDeposits();
        return deposit;
    }

    public int getTotalNumberOfWithdraws() {
        int withdraws = this.cashMachine1.getNumberOfWithdraws() + this.cashMachine2.getNumberOfWithdraws() + this.cashMachine3.getNumberOfWithdraws();
        return withdraws;

    }

    public double getTotalAverageOfDeposits() {
        double avgDeposit = (this.cashMachine1.getSumOfDeposits() + this.cashMachine2.getSumOfDeposits() + this.cashMachine3.getSumOfDeposits()) / (this.cashMachine1.getNumberOfDeposits() + this.cashMachine2.getNumberOfDeposits() + this.cashMachine3.getNumberOfDeposits());
        return avgDeposit;
    }

    public double getTotalAverageOfWithdraws() {
        double avgWithdraw = (this.cashMachine1.getSumOfWithdraws() + this.cashMachine2.getSumOfWithdraws() + this.cashMachine3.getSumOfWithdraws()) / (this.cashMachine1.getNumberOfWithdraws() + this.cashMachine2.getNumberOfWithdraws() + this.cashMachine3.getNumberOfWithdraws());
        return avgWithdraw;
    }
}
