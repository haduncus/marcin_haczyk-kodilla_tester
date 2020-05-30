package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();
    Set<Integer> set = new HashSet<>();

    @ParameterizedTest
    @CsvFileSource(resources = "/validatedUserNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnTrueWhenNumbersAreValidated(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);
        set.add(f);

        gamblingMachine.howManyWins(set);
        assertEquals(6, set.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notValidatedUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenNumbersAreNotValidated(int a, int b, int c, int d, int e, int f) {
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);
        set.add(f);

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowExceptionWhenSetIsNullOrEmpty(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(set));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooSmallSet.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetIsTooSmall(int a, int b, int c, int d, int e) {
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooBigSet.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetIsTooBig(int a, int b, int c, int d, int e, int f, int g) {
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);
        set.add(f);
        set.add(g);

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }
}