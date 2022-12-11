package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        //get all links by (a tags) from website //store it in a List
       List<WebElement> ebayLinks =driver.findElements(By.tagName("a"));

       //print size of list
        System.out.println("Link size is "+ebayLinks.size());

        //extract links using for loops to traverse thru the list of webelements

        for(WebElement ebayLink:ebayLinks) {
            //extract value of href that contains the link embedded in the WEbElements and assign to a var
            String link= ebayLink.getAttribute("href");
            //print the link
            System.out.println(link);

        }
    }
}
