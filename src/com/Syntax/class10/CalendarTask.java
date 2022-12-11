package com.Syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
//Go to syntax hrms .
//Go-to the recruitment tab.
//From the calendar  just select a date
//8 August 2023

public class CalendarTask {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        driver.findElement(By.xpath("//a/b[text()='Recruitment']")).click();

        WebElement img=driver.findElement(By.xpath("//li[7]/img"));
        img.click();

        WebElement month= driver.findElement(By.xpath("//div/div/select[1]"));
        Select sel=new Select(month);
        sel.selectByValue("7");

        WebElement year=driver.findElement(By.xpath("//div/select[2]"));
        Select select=new Select(year);
        select.selectByVisibleText("2023");

        driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/a")).click();
    }
}
