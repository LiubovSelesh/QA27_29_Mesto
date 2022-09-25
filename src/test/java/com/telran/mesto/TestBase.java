package com.telran.mesto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://mesto.om.nomoredomains.xyz");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;

    }

    public void isLoginButtonPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'Log in')]")));
    }

    public void isRegistrationFormPresent() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".auth__form")));
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillDataUserForm(String email, String password) {
        type(By.cssSelector("[placeholder='Email']"), email);
        type(By.cssSelector("[placeholder='Password']"), password);
    }

    public void fillDataLoginUser() {
        click(By.cssSelector(".auth__submit-button"));
        fillDataUserForm("waz56@gm.com", "1234");
        click(By.cssSelector(".auth__submit-button"));
    }

    public void AddNewPhoto() {
        typeNamePhoto(By.cssSelector("[placeholder='Name']"), "IndianMan");
        typeImage(By.cssSelector("[placeholder='Picture link']"), "https://images.unsplash.com/photo-1664101055972-63f92747bb4b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80");
        click(By.xpath("//button[contains(text(),'Create')]"));
    }

    public void typeNamePhoto(By by, String text) {
        type(by, text);
    }

    public void typeImage(By locator, String image) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(image);
    }

    public boolean isLogInButtonPresent() {
        return !isElementPresent(By.xpath("//a[contains(.,'Register')]"));
    }

    public void createNewUser() {
        int i = (int) ((System.currentTimeMillis()) / 1000) % 3600;

        click(By.xpath("//a[contains(.,'Register')]"));
        isRegistrationFormPresent();
//        fillDataUserForm("waz" + i + "@gm.com", "0987");
        fillDataUserForm("waz" + i + "gm.com", "1234");
        click(By.xpath("//button[contains(.,'Register')]"));
        isLoginButtonPresent();
    }

    protected void clickOnLoginTap() {
        click(By.xpath("//a[contains(.,'Log in')]"));
    }

    public boolean isLogOutTapPresent() {
        return isElementPresent(By.xpath("//button[contains(.,'Log out')]"));
    }

    public boolean isAddPhotoPresent() {
        return isElementPresent(By.cssSelector("#add-place"));
    }

    public void clickNewPhotoButton() {
        click(By.cssSelector(".profile__add-button"));
    }

    public void clickLogOut() {
        click(By.cssSelector(".header__logout"));
    }

    protected void isFormOnMainPage() {
        isElementPresent(By.cssSelector(".auth__form"));
    }
}
