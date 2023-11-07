package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import pages.magento.LoginPage;

public class ValidPasswordNoEmailLoginTest extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(ValidPasswordNoEmailLoginTest.class.getName());

    String email = "";
    String password = prop.getProperty("magPassword");

    LoginPage loginPage = new LoginPage(getDriver());

    @Test
    public void clickSignIn(){
        loginPage.clickSignIn();
    }
    @Test
    public void LogIn(){
        loginPage.email(email);
        loginPage.password(password);
        loginPage.SignIn();
    }
}
