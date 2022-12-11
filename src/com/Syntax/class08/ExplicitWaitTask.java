package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement box=driver.findElement(By.xpath("//input"));
        box.click();

        WebElement remove=driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();;

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement text=driver.findElement(By.xpath("//p[@id='message']"));
        String text1=text.getText();
        System.out.println(text1);

        WebElement enableBtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement text2=driver.findElement(By.xpath("//p[@id='message']"));
        String enableText=text2.getText();
        System.out.println(enableText);

       WebElement btn=driver.findElement(By.xpath("//form[@id='input-example']/input"));
       btn.sendKeys("Hello");
       WebElement disableBtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
       disableBtn.click();

        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement text3=driver.findElement(By.xpath("//p[@id='message']"));
        String disTExt=text3.getText();
        System.out.println(disTExt);
        System.out.println("Textbox enabled status: "+btn.isEnabled());
    }
}
