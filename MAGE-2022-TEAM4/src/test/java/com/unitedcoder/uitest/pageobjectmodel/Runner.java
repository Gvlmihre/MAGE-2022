package com.unitedcoder.uitest.pageobjectmodel;

import com.unitedcoder.frontend.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class Runner{
    private WebDriver driver;
    public Runner(WebDriver driver) {
        this.driver = driver;
    }

    public static void main(String[] args) {
        TestBase testBase=new TestBase();
        testBase.browserSetUp();
    }

    WebElement quantityField = driver.findElement(By.id("qty"));


}





