package com.telran.mesto;

import org.testng.annotations.Test;

public class OpenHomePage extends TestBase{

    @Test
    public void openHomePageTest(){
        System.out.println("Opened home page");
        app.getUser().isFormOnMainPage();
    }

}


