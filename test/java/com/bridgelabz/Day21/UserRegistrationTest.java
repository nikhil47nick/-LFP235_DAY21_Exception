package com.bridgelabz.Day21;


import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    @Test
    public void testFirstNamePatternInvalid() throws CustomException{
            UserRegistration uc = new UserRegistration();
            Assert.assertEquals("Valid", uc.firstNameCheck("Nikhil"));
    }

    @Test
    public void testLastName()throws CustomException{
        Assert.assertEquals("Valid", UserRegistration.lastNameCheck("Joji"));

    }

    @Test
    public void testMobile()throws CustomException{
        Assert.assertEquals("Valid", UserRegistration.phoneNumberCheck("9887799762"));
    }

    @Test
    public void testPassword()throws CustomException{
        Assert.assertEquals("Valid", UserRegistration.passwordCheck("Abc@321in"));
    }
    @Test
    public void testPasswordIvalid()throws CustomException{
        Assert.assertEquals("Invalid", UserRegistration.passwordCheck("Abc"));
    }

}