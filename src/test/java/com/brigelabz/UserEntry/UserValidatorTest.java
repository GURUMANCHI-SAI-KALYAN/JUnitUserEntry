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
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("917013688155");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Saikalyan5Sai");
        Assert.assertFalse(result);
    }
}
