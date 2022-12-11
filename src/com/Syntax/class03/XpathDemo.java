package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

            //Create a WebDriver instance
            WebDriver driver=new ChromeDriver();//launch browser
            //go to FB
            driver.get("https://facebook.com");



            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Tatiana");

            //click on forgot password
            driver.findElement((By.xpath("//a[text()='Forgot password?']"))).click();
            //driver.findElement((By.xpath("//button[contains(@type,'sub')]"))).click();
            //driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();

    }
}
