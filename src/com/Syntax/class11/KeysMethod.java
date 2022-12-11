package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KeysMethod {//Make sure the name of class isnt key on order to use keys method

    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

       WebElement userName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
       userName.sendKeys("Tester", Keys.TAB);

       WebElement pass=driver.findElement(By.xpath("input[@name='ctl00$MainContent$password"));
       pass.sendKeys("test", Keys.ENTER);

    }
}
