package com.Syntax.Test;

import com.Syntax.Pages.LogInPage;
import com.Syntax.Utils.CommonMethods;

public class LogInPageTest {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LogInPage login=new LogInPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
