package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EbayTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement categories=driver.findElement(By.xpath("//select[@name='_sacat']"));
        Select options=new Select(categories);
        List<WebElement> list=options.getOptions();

        for(int i=0; i<list.size();i++){

           WebElement allCategories=list.get(i);
           String name=allCategories.getText();
            System.out.println(name);
        }

        options.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        String title=driver.getTitle();
        System.out.println("Title from getTitle method is : " +title);

        if(title.equalsIgnoreCase("Computers, Tablets & Network Hardware")) {

            System.out.println("Title from method and on the page match");
        }else {
            System.out.println("Title on the page does not match");
        }

    }
}
