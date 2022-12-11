package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();//launch browser
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.className("button")).click();

        //Find title in the dom and Make sure that its correct ie. WebOrder

        //get title of page


        String title=driver.getTitle();
        System.out.println(title);

        if(title.equalsIgnoreCase("Web Orders")) {
            System.out.println("title is correct "+title);
        }else {
            System.out.println("Title is incorrect "+title);
        }
    }
}
