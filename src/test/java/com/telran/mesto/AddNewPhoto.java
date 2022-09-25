package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewPhoto extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        fillDataLoginUser();
    }

    @Test
    public void addNewPhotoPositiveTest() {
        clickNewPhotoButton();
        Assert.assertTrue(isAddPhotoPresent());
        AddNewPhoto();
    }


}
