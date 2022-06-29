package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PhoneNumberValidatorTest {

    private PhoneNumberValidator phoneNumberValidator;
    private EmailValidator emailValidator;

    @BeforeEach
    void setUp() {
        phoneNumberValidator = new PhoneNumberValidator();
        emailValidator = new EmailValidator();
    }

    @Test
    @DisplayName("This is display name")
    void itShouldValidatePhoneNumber() {
        //Given
        String phoneNumber = "+610451330123";

        //When
        boolean isValid = phoneNumberValidator.test(phoneNumber);

        //Then
        assertThat(isValid).isTrue();


    }

    @ParameterizedTest
    @CsvSource({
            "abc@gmail.com,TRUE",
            "abcagmail.com,false"
    })
    void testValidateEmail(String email, boolean expected) {

        //When
        boolean isValid = emailValidator.test(email);

        //Then
        assertThat(isValid).isEqualTo(expected);


    }

}
