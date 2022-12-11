package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();//launch browser
        driver.get("https://www.facebook.com/");
//enter Username in the TextBox
        //1.locate the element and send the key
        driver.findElement(By.id("email")).sendKeys("Hi Ayden");
        //enter password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("abc123");

        //click the login

        //driver.findElement(By.name("login")).click();

        //Task 2 - click on forgot password using linkText locator

        //driver.findElement(By.linkText("Forgot password?")).click();

        //for the following task to work comment out task2 and login functionalities

        //Task3-Click on forgotten password using partial link text

        driver.findElement(By.partialLinkText("Forgotten")).click();

    }
}

