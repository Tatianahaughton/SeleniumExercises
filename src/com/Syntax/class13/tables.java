package com.Syntax.class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tables {
    //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

        //go to table look for id 45156A and check its checkbox

        //counter var to look for the row ID is in

        //        counter variable
        int rowCount = 0;
        boolean notFound = true;

        while (notFound) {

            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (WebElement id : idColumn) {
                String personID = id.getText();

                if (personID.equals("41641A")) {
                    System.out.println("the row number of the desired id is " + (rowCount + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                    checkBox.click();
                    //after checking the box it sets the boolean to false;
                    notFound = false;
                    break;
                }
                rowCount = rowCount + 1;
            }
            if (notFound) {
                //add below code so that it starts after the whole loops traverses through the whole 1st page, then goes to Next.
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                //resert the row count for each page
                rowCount =0;
            }
        }
    }
}
//another way?
//public void clickonCheckBox(String id) {
    //logic
//}
