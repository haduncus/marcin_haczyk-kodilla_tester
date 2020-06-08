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
    @CsvFileSource(resources = "/validatedUserNumbers.csv", numLinesToSkip = 0)
    public void shouldReturnTrueWhenNumbersAreValidated(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        gamblingMachine.howManyWins(set);
        assertEquals(6, set.size());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notValidatedUserNumbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenNumbersAreNotValidated(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldThrowExceptionWhenSetIsNullOrEmpty(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(set));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooSmallSet.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenSetIsTooSmall(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooBigSet.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenSetIsTooBig(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }
}