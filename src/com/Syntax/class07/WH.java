package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WH {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //go to gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        //click on help button and click
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();

        //click on privacy button and click
        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        //The title of desired page is Google Account Help

        //get ALL the window handles and store it in a Set type String
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            //then switch focus to the current handle from list
            driver.switchTo().window(handle);

            //get title to which driver switched to
            String title = driver.getTitle();

            //compare the titles to see which handle driver is on
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The current page is under focus is: " + title);
                break;
            }
        }

        //find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
    }
}



