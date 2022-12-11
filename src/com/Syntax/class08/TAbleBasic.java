package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TAbleBasic {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        //print the whole table on the console

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String allTable = table.getText();//use getTExt() to get all the text from table
        //System.out.println(allTable);


        //print all rows from table

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row : rows) {
            String rowText = row.getText();
            if (rowText.contains("Google")) {
                System.out.println(rowText);

            }
        }

        //print columns

        List <WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String colTExt=column.getText();
            System.out.println(colTExt);
            System.out.println("--------------------------------------------");
        }
    }
}

