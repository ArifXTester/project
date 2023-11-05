package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import saucedemotest.ValidLoginTest;
import utility.ExcelReader;
import utility.Utility;

import java.io.File;

public class LoginPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(ValidLoginTest.class.getName());
    String user = prop.getProperty("username");
    String pw = prop.getProperty("password");

    @Test
    public void loginWithValidCredentials() {
        pages.demoblaze.LoginPage logging = new pages.demoblaze.LoginPage();


        logging.typeUser(user);
        logging.typePassword(pw);
        logging.clickOnLoginBtn();
    }
}

