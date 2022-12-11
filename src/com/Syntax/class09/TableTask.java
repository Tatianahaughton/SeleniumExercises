package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

        List<WebElement> id = driver.findElements(By.xpath("//table[@id=\"resultTable\"]/tbody/tr"));
        for (int i = 0; i < id.size(); i++) {
            String text = id.get(i).getText();
            if (text.contains("45137A")) {
               List< WebElement> checkbox = driver.findElements(By.xpath("//tbody/tr/td[1]"));
                checkbox.get(i).click();
            }
        }

        //driver.navigate().forward();
    }
}
