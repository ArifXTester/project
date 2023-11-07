package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.LoginPage;

public class LoginPageTest extends CommonAPI {

    Logger LOG = (Logger) LogManager.getLogger(LoginPageTest.class.getName());

    String email = prop.getProperty("magEmail");
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
