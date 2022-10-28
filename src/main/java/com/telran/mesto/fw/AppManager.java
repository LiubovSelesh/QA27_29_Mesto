package com.telran.mesto.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AppManager  {
    WebDriver wd;
    UserHelper user;
    PhotoHelper photo;


    public PhotoHelper getPhoto() {
        return photo;
    }

    public UserHelper getUser() {
        return user;
    }

    public void init() {
        wd = new ChromeDriver();
        wd.get("https://mesto.om.nomoredomains.xyz");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(wd);
        photo = new PhotoHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

}
