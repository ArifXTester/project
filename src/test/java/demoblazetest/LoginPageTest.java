package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoblaze.LoginPage;
import utility.ExcelReader;
import utility.Utility;

import java.io.File;

public class LoginPageTest extends CommonAPI {
    LoginPage loginPage = new LoginPage(getDriver());
    Logger LOG = LogManager.getLogger(LoginPageTest.class.getName());
    String user = prop.getProperty("demouser");
    String pw = prop.getProperty("demopass");
    @Test
    public void loginWithValidCredentials() {
        loginPage.typeUser(user);
        loginPage.typePassword(pw);
        loginPage.clickOnLoginBtn();
    }
}

