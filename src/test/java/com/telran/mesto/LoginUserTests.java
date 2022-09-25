package com.telran.mesto;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getUser().isLogInButtonPresent()) {
            app.getUser().clickOnLoginTap();
        }
    }

    @Test
    public void loginUserPositiveTest() {
        app.getUser().fillDataLoginUser();
        Assert.assertTrue(app.getUser().isLogOutTapPresent());

    }

}
