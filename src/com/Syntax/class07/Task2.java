package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        WebElement newUser=driver.findElement(By.cssSelector("button#save"));
        newUser.click();

        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String name=firstName.getText();
        System.out.println("Text shown is " +name);

    }
}
