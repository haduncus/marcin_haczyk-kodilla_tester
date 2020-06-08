package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMI_TestSource {

    static Stream<Arguments> provideProperDataToTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(2, 59.5), "Very severely underweight"),
                Arguments.of(new Person(2, 60), "Severely underweight"),
                Arguments.of(new Person(1.8, 51.5), "Severely underweight"),
                Arguments.of(new Person(2, 64), "Underweight"),
                Arguments.of(new Person(1.8, 59.5), "Underweight"),
                Arguments.of(new Person(2, 74), "Normal (healthy weight)"),
                Arguments.of(new Person(1.8, 80.5), "Normal (healthy weight)"),
                Arguments.of(new Person(2, 100), "Overweight"),
                Arguments.of(new Person(1.8, 97), "Overweight"),
                Arguments.of(new Person(2, 120), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.8, 113), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(2, 140), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.8, 129.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(2, 160), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.8, 145.5), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(2, 180), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.8, 161.5), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(2, 200), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.8, 194), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(2, 240), "Obese Class VI (Hyper Obese)")
        );
    }
}