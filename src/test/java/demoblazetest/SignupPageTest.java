package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoblaze.HomePage;
import pages.demoblaze.SignUpPage;
import saucedemotest.ValidLoginTest;
import utility.ExcelReader;
import utility.Utility;

import java.io.File;

public class SignupPageTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(ValidLoginTest.class.getName());
    String name = prop.getProperty("demouser");
    String pass = prop.getProperty("demopass");
    ExcelReader excelReader = new ExcelReader(Utility.path+ File.separator+"data"+File.separator+"data.xlsx", "Data");
    @Test
    public void loginWithValidCredentials() {
        SignUpPage signUpPage = new SignUpPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        signUpPage.typeUsername(name);
        signUpPage.typePassword(pass);

        // Click the signup button
        signUpPage.clickOnLoginBtn();
    }


}
