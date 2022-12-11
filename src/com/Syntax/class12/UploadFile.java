package com.Syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile=driver.findElement(By.cssSelector("input#file-upload"));
        chooseFile.sendKeys("C:\\Users\\Tatiana Haughton\\Documents\\My photos\\IMG_2553.jpg");//path of file to upload
       // driver.findElement(By.cssSelector("input#file-submit")).click();
    }
}
