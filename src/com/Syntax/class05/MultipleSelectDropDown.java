package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

       WebElement dd= driver.findElement(By.xpath("//select[@id='multi-select']"));
       //use Select class
       Select sel=new Select(dd);

       //By index if there are not many options, otherwise use loop
        sel.selectByIndex(3);

        //By visibla text
        sel.selectByVisibleText("Texas");
        Thread.sleep(3000);

        //deselect by index
        sel.deselectByIndex(3);
//to select all options
        List<WebElement> options=sel.getOptions();

        for(int i=0;i<options.size();i++) {
            sel.selectByIndex(i);
        }

        Thread.sleep(3000);
        sel.deselectAll();

        //How can you check if the Drop down is munlti select or not

        //Use method isMultiple

        boolean multiSelect=sel.isMultiple();
        System.out.println(multiSelect);
    }


}

