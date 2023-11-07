package nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.nopcommerce.loginPage;

public class loginPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(registerPageTest.class.getName());
    String Email = prop.getProperty("nopEmail");
    String Password = prop.getProperty("nopPw");
    loginPage loginpage = new loginPage(getDriver());
    @Test
    public void ClickLogin(){
        loginpage.ClickLogIn();
    }
    public void fillForm(){
        loginpage.SelectEmail(Email);
        loginpage.SelectPassword(Password);
        loginpage.ClickLogIn();
    }

}
