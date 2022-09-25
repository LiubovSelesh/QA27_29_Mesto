package com.telran.mesto;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewPhoto extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.getPhoto().fillDataLoginUser();
    }

    @Test
    public void addNewPhotoPositiveTest() {
        app.getPhoto().clickNewPhotoButton();
        Assert.assertTrue(app.getPhoto().isAddPhotoPresent());
        app.getPhoto().AddNewPhoto();
    }


}
