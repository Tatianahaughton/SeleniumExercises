package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();//launch browser

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Tatiana");
        driver.findElement(By.name("customer.lastName")).sendKeys("Haughton");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Abc rd");
        driver.findElement(By.name("customer.address.city")).sendKeys("Fredericksburg");
        driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
        driver.findElement((By.name("customer.address.zipCode"))).sendKeys("22435");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("240-568-4325");
        driver.findElement(By.name("customer.ssn")).sendKeys("315-57-5643");
        driver.findElement(By.name("customer.username")).sendKeys("tatianahaughton");
        driver.findElement(By.name("customer.password")).sendKeys("1234567");
        driver.findElement(By.name("repeatedPassword")).sendKeys("1234567");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
