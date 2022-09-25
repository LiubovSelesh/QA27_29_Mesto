package com.telran.mesto.fw;

import com.telran.mesto.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void isLoginButtonPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'Log in')]")));
    }

    public void isRegistrationFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".auth__form")));
    }


    public boolean isLogInButtonPresent() {
        return !isElementPresent(By.xpath("//a[contains(.,'Register')]"));
    }

    public void createNewUser() {
        int i = (int) ((System.currentTimeMillis()) / 1000) % 3600;

        click(By.xpath("//a[contains(.,'Register')]"));
        isRegistrationFormPresent();
        fillDataUserForm(new User().setEmail("waz" + i + "@gm.com").setPassword("1234"));
        click(By.xpath("//button[contains(.,'Register')]"));
        isLoginButtonPresent();
    }

    public void clickOnLoginTap() {
        click(By.xpath("//a[contains(.,'Log in')]"));
    }

    public boolean isLogOutTapPresent() {
        return isElementPresent(By.xpath("//button[contains(.,'Log out')]"));
    }

    public void clickLogOut() {
        click(By.cssSelector(".header__logout"));
    }

}
