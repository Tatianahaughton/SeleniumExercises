package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorTask1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
       driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input[name='Submit']")).click();
        WebElement text=driver.findElement(By.cssSelector("a#welcome"));
        String welcomeAdmin=text.getText();
        System.out.println(welcomeAdmin+" message appears in the upper right corner");
    }
}
