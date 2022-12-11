package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement dropdown = driver.findElement(By.cssSelector("select#animals"));
        Select select = new Select(dropdown);

        select.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("DONE");

    }
}
