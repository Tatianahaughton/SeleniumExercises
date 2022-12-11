package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClassExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rgtClk=driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action=new Actions(driver);
        action.contextClick(rgtClk).perform();
    }
}
