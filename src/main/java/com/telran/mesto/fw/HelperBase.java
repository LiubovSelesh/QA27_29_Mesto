package com.telran.mesto.fw;

import com.telran.mesto.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;

    }

    public void type(By locator, String text) {
        if(text !=null) {
            wd.findElement(locator).click();
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }

    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillDataLoginUser() {
        click(By.cssSelector(".auth__submit-button"));
        fillDataUserForm(new User().setEmail("waz56@gm.com").setPassword("1234"));
        click(By.cssSelector(".auth__submit-button"));
    }

    public void fillDataUserForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void isFormOnMainPage() {
        isElementPresent(By.cssSelector(".auth__form"));
    }
}
