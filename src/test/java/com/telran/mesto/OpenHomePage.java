package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenHomePage extends TestBase{

    @Test
    public void openHomePageTest(){
        System.out.println("Opened home page");
        isFormOnMainPage();
    }

}


