package com.telran.mesto.fw;

import com.telran.mesto.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    public void clickWithAction(By save) {
        Actions actions = new Actions(wd);
        WebElement element = wd.findElement(save);

        actions.moveToElement(element).perform();
        element.click();
    }

    public void editNickName(){
        int i = (int) ((System.currentTimeMillis()) / 1000) % 3600;
        click(By.cssSelector(".profile__edit-button"));
        type(By.cssSelector("[placeholder='Your name']"), "Pumpkin");
        type(By.cssSelector("[placeholder='About you']"), "I'm yellow ripe pumpkin ");
        click(By.cssSelector(".popup__submit-button.popup__submit-button_[form='edit-profile']"));

    }

    public void editAvatarUser() {
        clickWithAction(By.cssSelector(".profile__avatar"));
        type(By.cssSelector("[placeholder='Avatar link']"), "https://images.unsplash.com/photo-1664321854962-8b106f97cf88?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1166&q=80");
        click(By.cssSelector(".popup__submit-button"));

    }
}
