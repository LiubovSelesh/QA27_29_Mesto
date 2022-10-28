package com.telran.mesto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewDataProfileTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.getUser().fillDataLoginUser();
    }

    @Test
    public void newDataProfile() {
        app.getUser().editNickName();
        app.getUser().editAvatarUser();
    }
}

