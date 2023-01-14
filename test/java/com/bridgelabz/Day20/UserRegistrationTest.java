package com.bridgelabz.Day20;

import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    @Test
    public void testFirstNamePattern() {
        UserRegistration uc = new UserRegistration();

        Assert.assertEquals("Valid",uc.firstNameCheck("Nikhil"));
    }

    @Test
    public void testLastName(){
        Assert.assertEquals("Valid",UserRegistration.lastNameCheck("Joji"));

    }

    @Test
    public void testMobile(){
        Assert.assertEquals("Valid",UserRegistration.phoneNumberCheck("9887799762"));
    }

    @Test
    public void testPassword(){
        Assert.assertEquals("Valid",UserRegistration.passwordCheck("Abc@321in"));
    }


}