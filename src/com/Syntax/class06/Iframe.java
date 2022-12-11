package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");

        //Task1=Print animals on screen and select baby cat from dropdown

        driver.switchTo().frame(1);
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text = animalText.getText();
        System.out.println(text);


        //Check the chrckbox

        driver.switchTo().defaultContent();//switch focys to main page
        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("hi");

        //finding the frame thru xpath and switching by WebElement method
        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));//find frame
        driver.switchTo().frame(frame3);//switch to the found frame

        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


    }
    }
