/*Utwórz pakiet com.kodilla.bank.homework, a w nim klasę CashMachine (Bankomat).
Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia, jeśli użytkownik wpłacił pieniądze,
ujemna jeśli użytkownik wypłacił pieniądze). Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.
Utwórz klasę Bank, która będzie zawierać tablicę bankomatów. Bank powinien mieć metody zwracające:

całkowity bilans ze wszystkich bankomatów,
liczbę transakcji związanych z wypłatą,
liczbę transakcji związaną z wpłatą pieniędzy,
średnią wartość wypłaty,
średnią wartość wpłaty.*/

package com.kodilla.bank.homework;

public class CashMachine {

    private int[] operations;
    private int size = 0;                                                                                                   // nie ma różnicy w ilości pozytywnie zakończonych tesów z i bez "static"

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