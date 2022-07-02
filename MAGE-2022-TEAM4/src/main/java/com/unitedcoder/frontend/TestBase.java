package com.unitedcoder.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    public WebDriver driver;
    public String browserName="chrome";

        public void browserSetUp(){
            if(driver==null){
                if(browserName.equalsIgnoreCase("chrome")){
                    System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("http://magentoqa2.unitedcoder.com/");
                }
                else if(browserName.equalsIgnoreCase("Fire fox")){
                    System.setProperty("webdriver.gecko.driver","c:\\webdriver\\geckodriver.exe");
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.get("http://magentoqa2.unitedcoder.com/");
                }
            }
        }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

    //static wait
    public static void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

