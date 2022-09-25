package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutUserTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        fillDataLoginUser();

    }

    @Test
    public void LogOutUserPositiveTest() {
        clickLogOut();
    }
}
