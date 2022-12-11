package com.Syntax.Pages;

import com.Syntax.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement userNamefield;

    @FindBy(id="txtPassword")
    public WebElement passwordfield;

    @FindBy(id="btnLogin")
    public WebElement loinbtn;

    //Call the constructor to initialize all elements:
    public LogInPageWithPageFactory() {
        PageFactory.initElements(driver,this);
    }


}
