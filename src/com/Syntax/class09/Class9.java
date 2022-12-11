package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class9 {
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
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        List<WebElement> secondC = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        for (int i = 0; i < secondC.size();i++) {
            String columnText=secondC.get(i).getText();
            //check desired value
            if(columnText.equalsIgnoreCase(("ScreenSaver")));
            System.out.println("the index of the row that containes 'Screensaver' is"+ i+1);

            //get that checkbox and click on it

            WebElement checkBox1=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+ "]/td[1]"));
            checkBox1.click();
            //click on it

        }
    }
}
