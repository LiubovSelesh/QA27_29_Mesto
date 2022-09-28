package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemovePhotoTests extends TestBase{



    @BeforeMethod
    public void ensurePrecondition() {
        app.getUser().fillDataLoginUser();
        app.getUser().click(By.cssSelector(".profile__add-button"));
        app.getPhoto().AddNewPhoto();

    }

    @Test
    public void removePhotoPositiveTest() {
        app.getPhoto().removePhoto();

    }

}

