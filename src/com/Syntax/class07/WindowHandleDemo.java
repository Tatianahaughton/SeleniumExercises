package com.Syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //go to gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

        //get window handle

        String GmailHandle=driver.getWindowHandle();//save it to a string
        //printit on screen
        System.out.println("The current window handle is "+GmailHandle);
        //output =The current window handle is CDwindow-194CD163248DCE68D8DBD6D84E92A07C (always a unique code/dynamic)


    }
    }
