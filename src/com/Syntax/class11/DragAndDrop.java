package com.Syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
            driver.manage().window().maximize();
            //  go to the website
            driver.get("https://jqueryui.com/droppable/");

driver.switchTo().frame(0);
            WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
            WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

            Actions act = new Actions(driver);
            //act.dragAndDrop(drag,drop).perform();//use dragAndDrop method or chain methods below
        act.clickAndHold(drag).moveToElement(drop).release().build().perform();//buid chains multiplpe actions together
        //build all the methods together first then perform.
        }
    }

