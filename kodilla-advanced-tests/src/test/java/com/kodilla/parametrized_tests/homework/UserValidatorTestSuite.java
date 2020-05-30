package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test-Name.66", "99_bob", "bob"})
    public void shouldReturnTrueWhenUsernameSyntaxIsCorrect(String userName) {
        boolean result = validator.validateUsername(userName);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@Bob", "test-Name<3", "ET", "VeryLongTestName", ""})
    public void shouldReturnFalseWhenUserNameSyntaxIsIncorrect(String userName) {
        boolean result = validator.validateUsername(userName);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@gmail.com", "b.test-66@example-domain.pl"})
    public void shouldReturnTrueWhenEmailSyntaxAddressIsCorrect(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test'66@gmail.com", "test@gmail,com", "test@gmail", "test.com", "test?@example.pl"})
    public void shouldReturnFalseWhenEmailSyntaxAddressIsIncorrect(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnWhenEmailAddressIsEmpty(String email) {
        assertFalse(validator.validateEmail(email));
    }
}