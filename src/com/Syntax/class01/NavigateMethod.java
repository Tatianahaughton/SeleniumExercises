package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        // go to google.com
        //goto fb.com
        //go to google.com

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create the webdriver instance
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://ww.google.com");

        driver.navigate().to("https://www.facebook.com/");

        //introduce sleep/wait
        //pause for 2 sec
        Thread.sleep(2000);
        driver.navigate().back();

        //wait 2 sec
        Thread.sleep(2000);
        //go back to fb.com
        driver.navigate().forward();

        //wait 1 sec

        Thread.sleep(1000);
        driver.navigate().refresh();
    }
}


