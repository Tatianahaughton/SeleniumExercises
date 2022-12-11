package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTask2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
      WebElement message=driver.findElement(By.cssSelector("span#spanMessage"));
      String displayedMessage=message.getText();

      boolean displayed=message.isDisplayed();
      if(displayed) {
          System.out.println(displayedMessage+" is displayed");
      }else {
          System.out.println(displayedMessage+" is not displayed");
      }




    }
}
