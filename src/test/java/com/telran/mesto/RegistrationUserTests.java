package com.telran.mesto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getUser().isLogInButtonPresent()) {
            app.getUser().clickOnLoginTap();
        }
    }

    @Test
    public void registrationPositiveTest() {
        app.getUser().createNewUser();

    }

}
