package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the webelement drop down by loolking at select tag and store in a var
       WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));

                // use Select class
                Select select=new Select(dropDown);

                //select an option by Index
                select.selectByIndex(5);
                Thread.sleep(3000);

                //or select by text
               select.selectByVisibleText("Saturday");
               Thread.sleep(3000);

               //or by value
        select.selectByValue("Sunday");

//get all options available from dropdown
        List<WebElement> options=select.getOptions();

        //traverse thru the options by using for loop
        for(int i=0; i< options.size(); i++) {

            WebElement option =options.get(i);
            String text= option.getText();
         if(text.equalsIgnoreCase("Friday")); {
               select.selectByIndex(i);
            }


        }



    }
}
