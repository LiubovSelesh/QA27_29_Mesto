package com.telran.mesto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (isLogInButtonPresent()) {
            clickOnLoginTap();
        }
    }

    @Test
    public void registrationPositiveTest() {
        createNewUser();

    }

}
