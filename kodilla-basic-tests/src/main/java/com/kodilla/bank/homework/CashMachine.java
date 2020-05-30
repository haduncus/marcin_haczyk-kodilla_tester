package com.kodilla.bank.homework;

public class CashMachine {

    private String id;
    private Bank deposit;
    private Bank withdraw;
    private static int[] depositArr;
    private static int[] withdrawArr;
    private int sizeWithdraw;
    private int sizeDeposit;

    public CashMachine(String id) {
        this.id = id;
        this.deposit = new Bank();
        this.withdraw = new Bank();
        this.sizeDeposit = 0;
        this.sizeWithdraw = 0;
    }

    public void addDeposit(int amount) {
        int transactionLimit = 5000;
        if(amount > 0 && amount <= transactionLimit) {
            //this.sizeDeposit++;
            this.deposit.addDeposit(amount);
            /*int[] newTab = new int[this.sizeDeposit];
            System.arraycopy(depositArr, 0, newTab, 0, depositArr.length);
            newTab[this.sizeDeposit - 1] = amount;
            depositArr = newTab;*/
        }
    }

    public void addWithdraw(int amount) {
        int transactionLimit = 2000;
        if(amount > 0 && amount <= transactionLimit) {
            //this.sizeWithdraw++;
            this.withdraw.addWithdraw(amount);
            /*int[] newTab = new int[this.sizeWithdraw];
            System.arraycopy(withdrawArr, 0, newTab, 0, withdrawArr.length);
            newTab[this.sizeWithdraw - 1] = amount;
            withdrawArr = newTab;*/
        }
    }

    public int[] getDepositArr() {
        return this.deposit.getDepositTransactions();
    }

    public int[] getWithdrawArr() {
        return this.withdraw.getWithdrawTransactions();
    }
}