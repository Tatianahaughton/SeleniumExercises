package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/");
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Tatiana");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
