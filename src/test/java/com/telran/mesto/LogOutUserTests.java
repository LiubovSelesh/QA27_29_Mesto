package com.telran.mesto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.getUser().fillDataLoginUser();

    }

    @Test
    public void LogOutUserPositiveTest() {
        app.getUser().clickLogOut();
    }
}
