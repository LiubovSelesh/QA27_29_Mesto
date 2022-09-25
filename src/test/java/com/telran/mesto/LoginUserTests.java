package com.telran.mesto;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (isLogInButtonPresent()) {
            clickOnLoginTap();
        }
    }

    @Test
    public void loginUserPositiveTest() {
        fillDataLoginUser();
        Assert.assertTrue(isLogOutTapPresent());

    }

}
