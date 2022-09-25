//package com.telran.mesto;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class RemovePhotoTests extends TestBase{
//
//    @BeforeMethod
//    public User ensurePrecondition() {
//        fillDataLoginUser();
//        click(By.cssSelector(".profile__add-button"));
//        AddNewPhoto();
//    }
////
//    @Test
//    public User removePhotoPositiveTest() {
//        removePhoto();
////        click(By.cssSelector(".place:nth-child(3) .place__trash_type_active"));
////        click(By.xpath("//button[contains(text(),'Yes')]"));
//    }
//
//    public User removePhoto() {
//        if(!isPhotoListEmpty()) {
//            wd.findElement(By.cssSelector(".place:nth-child(3) .place__trash_type_active")).click();
////            wd.findElement()
//        }
//    }
//
//    public boolean isPhotoListEmpty() {
//        return wd.findElements(By.cssSelector("")).isEmpty();
//    }
//}
