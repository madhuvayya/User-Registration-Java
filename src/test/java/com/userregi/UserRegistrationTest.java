package com.userregi;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Madhu");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Ma");
        Assert.assertEquals(false,result);
    }
}
