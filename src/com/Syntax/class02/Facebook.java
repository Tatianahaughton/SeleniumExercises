package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();//launch browser

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("firstname")).sendKeys("Tatiana");
        driver.findElement(By.name("lastname")).sendKeys("Haughton");
        driver.findElement(By.name("reg_email__")).sendKeys("blah@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
        Thread.sleep(1500);
       driver.quit();
    }
}
