package com.telran.mesto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhotoHelper extends HelperBase {

    public PhotoHelper(WebDriver wd) {
        super(wd);
    }

    public void AddNewPhoto() {
        type(By.cssSelector("[placeholder='Name']"), "IndianMan");
        type(By.cssSelector("[placeholder='Picture link']"), "https://images.unsplash.com/photo-1664101055972-63f92747bb4b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80");
        click(By.xpath("//button[contains(text(),'Create')]"));
    }

    public boolean isAddPhotoPresent() {
        return isElementPresent(By.cssSelector("#add-place"));
    }

    public void clickNewPhotoButton() {
        click(By.cssSelector(".profile__add-button"));
    }



}
