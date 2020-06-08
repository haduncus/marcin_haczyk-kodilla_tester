package com.kodilla.bank.homework;

public class CashMachine {

    private int[] operations;
    private int size = 0;

    public CashMachine() {
        this.operations = new int[0];
    }

    public void addOperation(int operation) {
        this.size++;
        int[] newOperations = new int[this.size];
        System.arraycopy(operations, 0, newOperations, 0, operations.length);
        newOperations[this.size - 1] = operation;
        this.operations = newOperations;
    }

    public int[] getOperations() {
        return operations;
    }

    public int getBalance() {
        if (this.operations.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.operations.length; i++) {
            sum += this.operations[i];
        }
        return sum;
    }

    public int getNumberOfDeposits() {
        int deposits = 0;
        if (this.operations.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] > 0) {
                    deposits++;
                }
            }
        }
        return deposits;
    }

    public int getNumberOfWithdraws() {
        int withdraws = 0;
        if (this.operations.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] < 0) {
                    withdraws++;
                }
            }
        }
        return withdraws;
    }

    public double getSumOfDeposits() {
        if (getNumberOfDeposits() == 0) {
            return 0;
        }
        double deposits = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0) {
                deposits += operations[i];
            }
        }
        return deposits;
    }

    public double getSumOfWithdraws() {
        if (getNumberOfWithdraws() == 0) {
            return 0;
        }
        double withdraws = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0) {
                withdraws += operations[i];
            }
        }
        return withdraws;
    }

    public double getAverageOfDeposits() {
        return getSumOfDeposits() / getNumberOfDeposits();
    }

    public double getAverageOfWithdraws() {
        return getSumOfWithdraws() / getNumberOfWithdraws();
    }
}