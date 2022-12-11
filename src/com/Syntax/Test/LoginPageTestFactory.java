package com.Syntax.Test;

import com.Syntax.Pages.LogInPageWithPageFactory;
import com.Syntax.Utils.CommonMethods;

public class LoginPageTestFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LogInPageWithPageFactory login=new LogInPageWithPageFactory();
        login.userNamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loinbtn.click();
    }
}
