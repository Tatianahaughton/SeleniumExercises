package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver=new ChromeDriver();//launch browser

        //use get() function to open up the required website
        driver.get("https://www.google.com/");
        // get the url of the website
        String url=driver.getCurrentUrl();
        //print the url
        System.out.println(url);

        //get the title

        String title=driver.getTitle();//use the get Title method and then store it as variable to get.

        System.out.println(title);

       // driver.quit();
    }
}
