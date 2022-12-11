package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tatiana");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Barrow");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("blahblah@gmail.com");
        driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("blahblah@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("haha123");

        WebElement birthdayMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select select=new Select(birthdayMonth);
        select.selectByValue("9");

        WebElement day =driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select2=new Select(day);
        select2.selectByValue("6");

        WebElement year=driver.findElement(By.cssSelector("select#year"));
        Select select3=new Select(year);
        select3.selectByValue("2000");

        WebElement checkbox=driver.findElement(By.xpath("//input[@value='1']"));
        checkbox.click();
    }
}
