package nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.nopcommerce.loginPage;

public class invalidEmailTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(invalidEmailTest.class.getName());
    String Email = "";
    String Password = prop.getProperty("nopPw");
    loginPage loginPage = new loginPage(getDriver());
    @Test
    public void ClickLogin(){
        loginPage.ClickLogIn();
    }
    public void fillForm(){
        loginPage.SelectEmail(Email);
        loginPage.SelectPassword(Password);
        loginPage.ClickLogIn();
    }



}
