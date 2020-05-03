package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private String eMail;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public UserRegistrationTest(String eMail,boolean expectedResult) {
        this.eMail = eMail;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initilize(){
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Madhu");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Ma");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Maad1df");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateFirstName("Ram#mjf");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateLastName("Vayya");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateLastName("Va");
        Assert.assertFalse(result);
    }

    @Parameterized.Parameters
    public static Collection eMailIds_WithExpectedResult() {
        return Arrays.asList(new Object[][] {   {"abc@yahoo.com",true},
                                                {"abc-100@yahoo.com",true},
                                                {"abc.100@yahoo.com",true},
                                                {"abc111@abc.com",true},
                                                {"abc-100@abc.net",true},
                                                {"abc.100@abc.com.au",true},
                                                {"abc@1.com",true},
                                                {"abc@gmail.com.com",true},
                                                {"abc+100@gmail.com",true},
                                                {"abc",false},
                                                {"abc@.com.my",false},
                                                {"abc123@gmail.a",false},
                                                {"abc123@.com",false},
                                                {"abc123@.com.com",false},
                                                {".abc@abc.com",false},
                                                {"abc()*@gmail.com",false},
                                                {"abc@%*.com",false},
                                                {"abc..2002@gmail.com",false},
                                                {"abc.@gmail.com",false},
                                                {"abc@abc@gmail.com",false},
                                                {"abc@gmail.com.1a",false},
                                                {"abc@gmail.com.aa.au",false} });
    }

    @Test
    public void givenEmailIds_WhenProper_ShouldReturnExpectedResult() {
        System.out.println("Expected Result:"+ expectedResult);
        Assert.assertEquals(expectedResult, userRegistration.validateEmailId(eMail));
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateMobileNumber("91 7680002101");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateMobileNumber("917680002101");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateMobileNumber("917680002");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validateMobileNumber("1234567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("nDj1k2*jf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("3Rmdg*nK");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("Mas1bt&Bx");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("mDkk%fD1");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("Kd1%f");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("mDkkfD12");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("mDkk%fDB");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        UserRegistration userRegi = new UserRegistration();
        boolean result = userRegi.validatePassword("mDkk%f#D1");
        Assert.assertFalse(result);
    }
}
