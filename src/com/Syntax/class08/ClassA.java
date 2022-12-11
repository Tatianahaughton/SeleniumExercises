package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class ClassA {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement button = driver.findElement(By.cssSelector("button#populate-text"));
        WebElement text = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(text.getText());

        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);//this wait is dedicated to a specific element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

        WebElement visibleBtn= driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();

    }
}
