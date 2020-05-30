package com.kodilla.bank.homework;

public class Bank {

    private int[] depositTransactions;
    private int[] withdrawTransactions;
    private int depositArrSize;
    private int withdrawArrSize;
    private static int totalBalance;

    public Bank() {
        this.depositTransactions = new int[0];
        this.withdrawTransactions = new int[0];
        this.depositArrSize = 0;
        this.withdrawArrSize = 0;
    }

    public void addDeposit(int value) {
        this.depositArrSize++;
        int[] newTab = new int[this.depositArrSize];
        System.arraycopy(depositTransactions, 0, newTab, 0, depositTransactions.length);
        newTab[this.depositArrSize - 1] = value;
        this.depositTransactions = newTab;
        totalBalance += value;
    }

    public void addWithdraw(int value) {
        withdrawArrSize++;
        int[] newTab = new int[this.withdrawArrSize];
        System.arraycopy(withdrawTransactions, 0, newTab, 0, withdrawTransactions.length);
        newTab[this.withdrawArrSize -1] = value;
        this.withdrawTransactions = newTab;
        totalBalance -= value;
    }

    public int[] getDepositTransactions() {
        return depositTransactions;
    }

    public int[] getWithdrawTransactions() {
        return withdrawTransactions;
    }

    public int getDepositAverage() {
        int depositAverage = 0;
        for(int i = 0; i < this.depositArrSize; i++) {
            depositAverage += this.depositTransactions[i];
        }
        return depositAverage / depositArrSize;
    }
    public int getWithdrawAverage() {
        int withdrawAverage = 0;
        for(int i = 0; i < this.withdrawArrSize; i++) {
            withdrawAverage += this.withdrawTransactions[i];
        }
        return withdrawAverage / withdrawArrSize;
    }

    public int getTotalNumberOfDeposit() {
        return this.depositArrSize;
    }

    public int getTotalNumberOfWithdraw() {
        return this.withdrawArrSize;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public double getAverage() {
        if(this.depositArrSize == 0 && this.withdrawArrSize == 0) {
            return 0;
        }
        double sumDep = 0;
        double sumWit = 0;
        for(int i = 0; i < this.depositArrSize; i++) {
            sumDep += this.depositTransactions[i];
        }
        for(int i = 0; i < this.withdrawArrSize; i++) {
            sumWit += this.withdrawTransactions[i];
        }
        return (sumDep - sumWit) / (this.depositArrSize + this.withdrawArrSize);
    }
}