package com.brigelabz.UserEntry;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sai");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Kalyan");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("kalyangurumanchi@gmail.com");
        Assert.assertTrue(result);
    }
}
