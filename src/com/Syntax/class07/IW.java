package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get(" https://syntaxprojects.com/dynamic-elements-loading.php");
        WebElement strtBtn=driver.findElement(By.id("startButton"));
        strtBtn.click();
//find the text
        WebElement welcomeText=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcomeText.getText();
        System.out.println("The text is " +text);
        System.out.println("The text shows empty because while the driver found the element in the DOM, it is appearing as 'display:none' so the text is displayed as empty.");

        //implicit wait is going to wait until the elements is found

    }

}
