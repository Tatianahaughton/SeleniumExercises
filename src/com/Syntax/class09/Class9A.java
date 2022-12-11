package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class9A {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //click on log in btn
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

//fin element that has Screensaver
        List<WebElement> secondC = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        for (int i = 0; i < secondC.size(); i++) {
            String text = secondC.get(i).getText();

            if (text.equalsIgnoreCase("Mymoney")) {

                System.out.println("Screen saver is found on row number : " + (i + 1));

                //get the chkBox on this row number and click on it
                WebElement chkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                chkBox.click();
            }
        }
    }
}
