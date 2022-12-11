package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        String gmail=driver.getWindowHandle();

        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();

        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
        }
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Google Account Help")) {
            WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
            communityBtn.click();
        }
        driver.switchTo().window(gmail);
        driver.findElement(By.cssSelector("input#username")).sendKeys("Tatianahaughton");
    }
    }

