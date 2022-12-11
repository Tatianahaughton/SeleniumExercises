package com.Syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

//find button and click on alert

        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);
 //Handling the alert/switchoing focus to the poop up/alert
        //Use methods availabe in that Alert class

        Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();//accepting alert, aka clicking 'ok'.

        //Find the button for confirtmatipn aler
        WebElement confirmAlert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmAlert.click();
        Thread.sleep(2000);

        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.dismiss();

        WebElement promptAlert=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

        Alert promptAlert1=driver.switchTo().alert();
        promptAlert1.sendKeys("Hi Tatiana");
        promptAlert1.accept();



    }
}
